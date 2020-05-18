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
	public static ListNode deleteKthToLast(ListNode head, int k) {

		ListNode ptr1 = head;
		ListNode ptr2 = head;

		if (ptr1.next == null) {
			ptr1 = ptr1.next;
			return ptr1;
		}

		while (k > 0) {
			ptr2 = ptr2.next;
			--k;
		}

		if (ptr2 == null) {

			ptr1 = ptr1.next;
			return ptr1;
		}

		while (ptr2.next != null) {
			ptr2 = ptr2.next;
			ptr1 = ptr1.next;
		}

		ptr1.next = ptr1.next.next;

		return head;
	}
	
}

