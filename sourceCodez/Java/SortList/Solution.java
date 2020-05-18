/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


class Solution {
    public ListNode sortList(ListNode head) {

    	return mergeSort(head);
    }

    ListNode sortedMerge(ListNode node1, ListNode node2) {

    	ListNode result = null;

    	// Base cases
    	if (node1 == null) {
    		return node2;
    	}
    	if (node2 == null) {
    		return node1;
    	}

    	// Picking either node1 or node2, and recur
    	if (node1.val <= node2.val) {
    		
    		result = node1;
    		result.next = sortedMerge(node1.next, node2);

    	} else {

    		result = node2;
    		result.next = sortedMerge(node1, node2.next);
    	}

    	return result;

    }

    ListNode mergeSort(ListNode head) {

    	// Base case : if empty || contains only one element
    	if (head == null || head.next == null) {
    		return head;
    	}

    	ListNode middle = getMiddle(head);
    	ListNode nextOfMiddle = middle.next;

    	// set teh next of middle node to null
    	middle.next = null;

    	// Apply mergeSort on part1
    	ListNode left = mergeSort(head);

    	// Apply mergeSort on part2
    	ListNode right = mergeSort(nextOfMiddle);

    	// Merge part1 and part2
    	ListNode sortedList = sortedMerge(left, right);

    	return sortedList;
    }

    public ListNode getMiddle(ListNode head) {

    	if (head == null) {
    		return head;
    	}

    	ListNode slow = head;
    	ListNode fast = head;

    	while (fast.next != null && fast.next.next != null) {
    		slow = slow.next;
    		fast = fast.next.next;
    	}

    	return slow;
    }
}
