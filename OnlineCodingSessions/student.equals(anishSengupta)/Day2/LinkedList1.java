// Accept n elements and create a linked list of those elements. 
// Print the linked list elements using the head of the linked list.

// Contraints: n >= 0.

import java.util.*; 

public class LinkedList1 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		ListNode head = acceptElementsAndCreateLinkedList();

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
}