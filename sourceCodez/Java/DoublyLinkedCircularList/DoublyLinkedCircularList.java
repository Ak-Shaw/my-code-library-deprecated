import java.io.*;
import java.util.*;

class  DoublyLinkedCircularList {

	public static boolean isCircularLinkedList(DoublyLinkedListNode head) {
		if (head == null) {
			return true;
		}
		DoublyLinkedListNode  slow = head;
		DoublyLinkedListNode fast = head;

		while (true) {
			if (slow.next == null) {
				return false;
			}
			slow = slow.next;
			if (fast.next == null || fast.next.next == null) {
				return false;
			}
			fast = fast.next.next;
			if (fast == slow) {
				return slow == head;
			}
		}
		// return false;
	}

	public static void printNode(DoublyLinkedListNode  node) {
		if (node == null) {
			System.out.print("null" ) ;
			return;
		}
		System.out.print( node.val   ) ;
	}

	public static void printDoublyLinkedCircularList(DoublyLinkedListNode  head) {
		if (head == null) {
			return;
		}
		DoublyLinkedListNode current = head;
		do {
			printNode(head.prev);
			System.out.print(" " );
			printNode(head);
			System.out.print( " ");
			printNode(head.next);
			System.out.print( "\n");
			head = head.next;
		} while (head != current);
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for ( int i = 0; i < n; i++) {
			int x = sc.nextInt();
			list.add(x);
		}

		ListNode head = ListNode.createList(list);
		DoublyLinkedListNode result = Solution.doublyLinkedCircularList(head);

		if (isCircularLinkedList(result) == false) {
			System.out.println("Not a circular list");
			return ;
		}

		printDoublyLinkedCircularList(result);

	}
}
