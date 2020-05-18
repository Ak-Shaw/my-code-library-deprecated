import java.util.*;

/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/

class Solution{
	public ListNode reverseEvenElements(ListNode head)
	{
		// If list is empty or contains only one element.
		if (head == null || head.next == null) {
			return head;
		}

		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode p1 = dummy;
		ListNode p2 = head;

		while (p2 != null) {

			// If we get a even valued node, create a new linked list. 
			// Add all the consecutively even values of the given list 
			// to this list and then reverse it and replace the already 
			// present contiguous even elements with the reversed version.
			if (p2.val % 2 == 0) {

				ListNode contiguousEvenList = new ListNode(p2.val);
				ListNode tail = contiguousEvenList;

				p2 = p2.next;

				while(p2 != null && p2.val % 2 == 0) {

					tail = insertValueAtTail(p2.val, tail);

					p2 = p2.next;
				}

				ListNode[] reverseResult = reverseLinkedList(contiguousEvenList);

				insertLinkedListBetweenTwoNodes(p1, p2, reverseResult[0], reverseResult[1]);

				p1 = p2;

				if (p2 == null) {

					break;

				} else {

					p2 = p2.next;
				}

			} else {

				p1 = p1.next;
				p2 = p2.next;
			}
		}

		return dummy.next;
	}

	// Reverses the given linked list and returns both the head and tail.
	public static ListNode[] reverseLinkedList(ListNode node) {

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
        ListNode head = prev;

        ListNode[] result = {head, last};

        return result;

    }

    public void insertLinkedListBetweenTwoNodes(ListNode node1, ListNode node2, ListNode head, ListNode tail) {

    	node1.next = head;
    	tail.next = node2;
    }

    public ListNode insertValueAtTail(int insertVal, ListNode tail) {

    	ListNode node = new ListNode(insertVal);

    	tail.next = node;
    	tail = tail.next;

    	return tail;
    }

}
