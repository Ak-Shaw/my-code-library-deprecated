import java.io.*;
import java.util.*;

class ListIntersectionPoint {
	public static ListNode addListAtEnd(ListNode head, ListNode commonHead) {
		if ( head == null) return commonHead;
		ListNode temp = head;
		if (commonHead == null) return head;
		while (head.next != null) {
			head = head.next;
		}
		head.next = commonHead;
		return temp;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for ( int i = 0; i < n1; i++) {
			int x = sc.nextInt();
			list1.add(x);
		}

		int n2 = sc.nextInt();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for ( int i = 0; i < n2; i++) {
			int x = sc.nextInt();
			list2.add(x);
		}
		int k = sc.nextInt();
		ArrayList<Integer> commonList = new ArrayList<Integer>();
		for ( int i = 0; i < k; i++) {
			int x = sc.nextInt();
			commonList.add(x);
		}

		ListNode head1 = ListNode.createList(list1);
		ListNode head2 = ListNode.createList(list2);
		ListNode commonHead = ListNode.createList(commonList);
		head1 = addListAtEnd(head1, commonHead);
		head2 = addListAtEnd(head2, commonHead);

		ListNode result = Solution.listIntersectionPoint(head1, head2);
		if (result == null) {
			System.out.print("-1");
		} else {
			System.out.print(result.val + " ");

		}
	}
}

