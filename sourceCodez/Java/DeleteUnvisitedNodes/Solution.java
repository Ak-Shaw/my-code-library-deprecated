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

	// To delete the unvisited nodes, according 
	// to the problem statement per say, we simply 
	// need to link the elements which satisfy the given 
	// criteria.
	// If we suppose that the value of a particular node is 
	// k, then we need to link the current node with k nodes after 
	// the current node.
    void deleteUnvisitedNodes(ListNode head) {

        while (head != null) {

            ListNode nextNode = getKthNodeAfter(head, head.val);

            head.next = nextNode;

            head = head.next;
        }
        
    }

    public ListNode getKthNodeAfter(ListNode head, int k) {

        int i = 0; 

        while (i < k && head != null) {

            head = head.next;

            i++;
        }

        return head;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; ++i) {
            int x = scanner.nextInt();
            list.add(x);
        }
        ListNode head = ListNode.createList(list);
        new Solution().deleteUnvisitedNodes(head);
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

