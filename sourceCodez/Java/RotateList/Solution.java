import java.util.*;

/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/

class Solution{
	public ListNode rotateList(ListNode head,int k)
	{

		// If the linked list is empty.
		if (head == null) {
			return head;
		}

		// after the loop, 
		// len will store the list length 
		// tmp will point to the last node
		ListNode tmp = head;
		int len = 1;
		while (tmp.next != null) {

			tmp = tmp.next;
			len++;
		}

		if (k > len) {
			k = k % len;
		}

		// Conversion of right rotation to left rotation.
		k = len - k;

		// If no rotation is needed.
		if (k == 0) {
			return head;
		}

		// current will either point to 
		// null or kth node after this loop
		ListNode current = head;
		int count = 1;
		while (count < k && current != null) {

			current = current.next;
			count++;
		}

		// If current is null then k is equal to the 
		// count of nodes in the list.
		// No change is required in such a case.
		if (current == null) {
			return head;
		}

		// current points to the kth node
		ListNode kthnode = current;

		// Change next of last node to previous head.
		tmp.next = head;

		// Change head to (k + 1)th node.
		head = kthnode.next;

		// Change next of kth node to null.
		kthnode.next = null;

		return head;
	}
}
