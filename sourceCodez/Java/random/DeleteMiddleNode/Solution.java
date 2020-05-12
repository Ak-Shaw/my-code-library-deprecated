import java.util.*;

/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/

class Solution {
    public static void deleteMiddleNode(ListNode node) {

    	node.val = node.next.val;
    	node.next = node.next.next;
    }
}
