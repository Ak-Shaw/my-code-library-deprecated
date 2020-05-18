import java.util.*;

/*
// Definition for ListNode
public class ListNode {

    public int val;
    public ListNode next;
    ListNode() {}
    ListNode(int x) {
        val = x;
        next = null;
    }
};
*/

class Solution{
	public ListNode moveMiddleToHead(ListNode head)
	{
        // If list is empty or contains only one element.
        if (head == null || head.next == null) {
            return head;
        }

        // If list contains two elements, reorder.
        if (head.next.next == null) {

            ListNode secondNode = head.next;

            head.next = null;

            secondNode.next = head;

            return secondNode;
        }

        ListNode middle = getMiddleNode(head);

        int middleVal = middle.val;

       // Replace middle value by copying value of next element.

        middle.val = middle.next.val;
        middle.next = middle.next.next;

        // Create new node using value of earlier middle node.
        ListNode newHead = new ListNode(middleVal);

        newHead.next = head;

        return newHead;
	}

    // Traverse linked list using two pointers. 
    // Move one pointer by one and other pointer 
    // by two. When the fast pointer reaches end
    // slow pointer will reach middle of the linked list.
    public ListNode getMiddleNode(ListNode head) {

        ListNode slow_ptr = head;
        ListNode fast_ptr = head;

        if (head != null) {

            while (fast_ptr != null && fast_ptr.next != null) {

                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }

            return slow_ptr;
        }

        return null;
    }
}
