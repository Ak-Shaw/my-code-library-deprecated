/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/
import java.io.*;
import java.util.*;

class MergeTwoSortedLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; ++i) {
            int x = scanner.nextInt();
            list1.add(x);
        }
        int m = scanner.nextInt();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0 ; i < m ; ++i) {
            int x = scanner.nextInt();
            list2.add(x);
        }
        scanner.close();

        ListNode list1Head = ListNode.createList(list1);
        ListNode list2Head = ListNode.createList(list2);
        ListNode resultHead = new Solution().mergeTwoLists(list1Head, list2Head);

        List<Integer> res = ListNode.extractList(resultHead);
        for(int element: res) {
            System.out.print(element + " ");
        }
    }
}
