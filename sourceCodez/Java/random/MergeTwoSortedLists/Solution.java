import java.io.*;
import java.util.*;

/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    	if (l1 == null) {
    		return l2;
    	} 

    	if (l2 == null) {
    		return l1;
    	}

    	ListNode dummy = new ListNode(0);

    	ListNode tail = dummy;

    	while(l1 != null && l2 != null) {

    		int val1 = l1.val;
    		int val2 = l2.val;

    		if (val1 < val2) {

    			tail = appendAtTail(tail, val1);

    			l1 = l1.next;
    		
    		} else {

    			tail = appendAtTail(tail, val2);

    			l2 = l2.next;
    		}
    	}

		tail = appendRemainingAtTail(tail, l1);

		tail = appendRemainingAtTail(tail, l2);

    	return dummy.next;
    }

    public ListNode appendRemainingAtTail(ListNode tail, ListNode node) {

    	while (node != null) {

    		int val = node.val;

    		tail = appendAtTail(tail, val);

    		node = node.next;
    	}

    	return tail;
    }

    public ListNode appendAtTail(ListNode tail, int insertVal) {

    	ListNode node = new ListNode(insertVal);

    	tail.next = node;

    	tail = tail.next;

    	return tail;
    }
}

