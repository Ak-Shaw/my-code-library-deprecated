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

  public static boolean isPalindrome( ListNode head) {

  	ListNode slowRunner = head;
  	ListNode fastRunner = head;

  	ListNode prevOfSlow = head;

  	// To handle case of odd sized list.
  	ListNode middle = null;

  	boolean result = true;

  	// If list is empty or contains only 
  	// one element.
  	if (head == null || head.next == null) {
  		return true;
  	}

  	// After this loop we'll have the fastRunner 
  	// pointing to null or last node, the slowRunner 
  	// will point to the exact middle node in case of odd 
  	// length list and will point to the second middle 
  	// in case of even length list, and the prevOfSlow 
  	// will point to the node coming before the slowRunner.
  	while (fastRunner != null && fastRunner.next != null) {

  		fastRunner = fastRunner.next.next;

  		prevOfSlow = slowRunner;

  		slowRunner = slowRunner.next;
  	}

  	// In case of even length list, fastRunner will point to 
  	// null and will point to last node in case of odd length 
  	// list. In case of odd length, we'll have to store 
  	// the middle node, which is pointed by the slowRunner 
  	// after the former loop, so that we can restore the linked 
  	// list. We'll also have to increment the slowRunner in such 
  	// a case so that we get the either side of the middle node.
  	if (fastRunner != null) {

  		middle = slowRunner;
  		slowRunner = slowRunner.next;

  	}

  	// Splitting the list to two halves.
  	ListNode secondHalf = slowRunner;
  	prevOfSlow.next = null; // null terminating the first half

  	secondHalf = reverseLinkedList(secondHalf);

  	result = compareLists(head, secondHalf);

  	// We need a second reversal so that we can restore the lists.
  	secondHalf = reverseLinkedList(secondHalf);

  	// Restoring the list.
  	if (middle != null) {

  		prevOfSlow.next = middle;
  		middle.next = secondHalf;

  	} else {

  		prevOfSlow.next = secondHalf;

  	}

  	return result;
  }

  public static Boolean compareLists(ListNode head1, ListNode head2) {

  	ListNode temp1 = head1;
  	ListNode temp2 = head2;

  	while (temp1 != null && temp2 != null) {

  		if (temp1.val == temp2.val) {

  			temp1 = temp1.next;
  			temp2 = temp2.next;

  		} else {

  			return false;

  		}
  	}

  	if (temp1 == null && temp2 == null) {

  		return true;

  	}

  	// This statement will be 
  	// reached if one of the 
  	// lists is non-empty.
  	return false;
  }

  public static ListNode reverseLinkedList(ListNode node) {

        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;

        ListNode last = null;
        boolean lastNodeStored = false;
        while (current != null) {

            next = current.next;
            current.next = prev;

            if (!lastNodeStored) {
                last = current;
                lastNodeStored = true;
            }

            prev = current;
            current = next;
        }
        
        return prev;

    }

}
