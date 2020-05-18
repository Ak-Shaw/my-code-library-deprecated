/*
public class ListNode {
   public int val;
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/
import java.io.*;
import java.util.*;

class Palindrome {
  public static boolean isEqual(ListNode head1, ListNode head2) {
    while(head1 != null && head2 != null) {
        if(head1.val != head2.val) {
            return false;
        }
        head1 = head1.next;
        head2 = head2.next;
    }
    return (head1 == null && head2 == null);
  }

  public static void  main (String args []) {
    Scanner sc =  new  Scanner (System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      ArrayList <Integer> list = new ArrayList<Integer> ();
      int x;
      for ( int i = 0 ; i < n; i++) {
        x = sc.nextInt();
        list.add(x);
      }
      ListNode head = ListNode.createList(list);
      ListNode originalHead = ListNode.createList(list);
      boolean flag  = Solution.isPalindrome(head);

      if (!isEqual(head, originalHead)) {
        System.out.println("Linked List has been modified");
	continue;
      } 

      if (flag == true ) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

    }
  }
}
