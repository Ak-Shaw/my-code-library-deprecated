import java.io.*;
import java.util.*;

class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; next = null; }

    public static ListNode createList(List<Integer> numbers) {
        if (numbers.size() == 0)
            return null;

        ListNode head = new ListNode(numbers.get(0));
        ListNode node = head;

        for (int i = 1; i < numbers.size(); ++i) {
            node.next = new ListNode(numbers.get(i));
            node = node.next;
        }

        return head;
    }

    public static List<Integer> extractList(ListNode head) {
        List<Integer> lst = new ArrayList<Integer>();

        while(head != null) {
            lst.add(head.val);
            head = head.next;
        }

        return lst;
    }
}

public class Solution {

	// 1. Add all the subset integers to a hashset.
	// 2. Visit a node, on visiting if the value of the node
	//    is present in hashset then create a linked list with 
	//    all the nodes which are consecutively present in the 
	//    hashset and add head of the created linked list to the result.
    public ArrayList<ListNode> connectedComponents(ListNode head , int subset[]) {
      
      ArrayList<ListNode> result = new ArrayList<ListNode>();

      HashSet<Integer> set = getSubsetHashSet(subset);

      while (head != null) {

        int currentVal = head.val;

        if (set.contains(currentVal)) {

            head = updateHeadAndGetConnectedComponents(head, set, result);

            continue;
        }

        head = head.next;
      }

      return result;
    }

    public ListNode updateHeadAndGetConnectedComponents(ListNode head, HashSet<Integer> set, ArrayList<ListNode> result) {

        ListNode connectedComponents = new ListNode(head.val);
        ListNode node = connectedComponents;

        head = head.next;

        while (head != null && set.contains(head.val)) {

            node.next = new ListNode(head.val);
            node = node.next;

            head = head.next;

        }

        result.add(connectedComponents);

        return head;
    }

    public HashSet<Integer> getSubsetHashSet(int[] subset) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < subset.length; i++) {

            set.add(subset[i]);
        }

        return set;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for ( int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			list.add(x);
        }
        int m = scanner.nextInt();
        int subset[] = new int[m];
        for(int i = 0; i < m ; i++) {
            subset[i] = scanner.nextInt();
        }
        ListNode head = ListNode.createList(list);
        ArrayList<ListNode> result = new Solution().connectedComponents(head , subset);
        for(int i = 0 ; i < result.size() ; i++) {
            ListNode ptr = result.get(i);
            while(ptr != null) {
                System.out.print(ptr.val + " ");
                ptr = ptr.next;
            }
            System.out.println();
        }
    }
}

