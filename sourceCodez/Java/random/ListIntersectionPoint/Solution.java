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
	public static ListNode listIntersectionPoint(ListNode head1, ListNode head2) {

		ListNode ptr1 = head1;
		ListNode ptr2 = head2;

		while (ptr1 != ptr2) {

			if (ptr1 == null) {

				ptr1 = head2;
			
			} else {

				ptr1 = ptr1.next;
			} 

			if (ptr2 == null) {

				ptr2 = head1;
			
			} else {

				ptr2 = ptr2.next;
			}
		}

		return ptr1;
	}
}

