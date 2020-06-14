// Insertion and Deletion in linked lists.


// Contraints: 
// n >= 0.
// 1 <= k <= n. in case of deletion
// 1 <= k <= n + 1. in case of insertion

import java.util.*; 

public class LinkedList2 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		ListNode head = acceptElementsAndCreateLinkedList();

		printLinkedList(head);	

		int k = sc.nextInt();
		int val = sc.nextInt();
		
		head = insertAtK(val, k, head);

		printLinkedList(head);	
	}

	public static ListNode acceptElementsAndCreateLinkedList() {

		// number of elements
		int n = sc.nextInt();

		// assign dummy node
		ListNode head = new ListNode(0);

		ListNode current = head;

		for (int i = 0; i < n; i++) {

			int value = sc.nextInt();

			ListNode node = new ListNode(value);

			current.next = node;

			current = current.next;
		}

		head = head.next;

		return head;
	}

	public static void printLinkedList(ListNode head) {

		while (head != null) {

			System.out.print(head.val + " -> ");

			head = head.next;
		}

		System.out.println(head);
	}

	public static ListNode insertAtK(int val, int k, ListNode head) {

		// insertion at head
		if (k == 1) {
			return insertAtHead(val, head);
		}

		ListNode current = getKthNode(head, k - 1);

		// insertion at tail
		if (current.next == null) {

			ListNode tail = new ListNode(val);

			current.next = tail;

			return head;
		}

		// insertion in middle
		ListNode nodeA = current;
		ListNode nodeB = current.next;
		ListNode node = new ListNode(val);
		nodeA.next = node;
		node.next = nodeB;

		return head;
	}

	public static ListNode insertAtHead(int val, ListNode head) {

		ListNode newHead = new ListNode(val);

		newHead.next = head;

		return newHead;
	}

	public static ListNode deleteAtK(int k, ListNode head) {

		if (k == 1) {
			return deleteHead(head);
		}

		ListNode current = getKthNode(head, k - 1);

		current.next = current.next.next;

		return head;
	}

	public static ListNode deleteHead(ListNode head) {

		return head.next;
	}

	public static ListNode getKthNode(ListNode head, int k) {

		int i = 1;
		ListNode current = head;
		while (i < k) {

			current = current.next;
			i++;
		}

		return current;
	}
}