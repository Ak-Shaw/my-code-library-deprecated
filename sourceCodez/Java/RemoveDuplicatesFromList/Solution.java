import java.io.*;
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
class Solution {

	public static ListNode removeDuplicatesFromList(ListNode head) {

		// empty or only one element
		if (head == null || head.next == null) {
			return head;
		}

		ListNode dummy = new ListNode(0);

		dummy.next = head;

		// create three pointers
		ListNode p1 = dummy;
		ListNode p2 = p1.next;
		ListNode p3 = p2.next;

		while (p3 != null) {

			if (p2.val == p3.val) {

				ListNode nextValueNode = getNextValueNode(p3);

				linkNodes(p1, nextValueNode);

				p2 = p1.next;

				if (p2 != null) {
					p3 = p2.next;
				} else {
					break;
				}

			} else { // increment the three pointers

				p1 = p2;;
				p2 = p3;
				p3 = p3.next;
			}
		}

		return dummy.next;
	}

	public static ListNode getNextValueNode(ListNode node) {

		int val = node.val;

		node = node.next;

		while (node != null) {

			if (node.val != val) {

				return node;
			}

			node = node.next;
		}

		return node;
	}

	public static void linkNodes(ListNode node1, ListNode node2) {

		node1.next = node2;
	}
}

