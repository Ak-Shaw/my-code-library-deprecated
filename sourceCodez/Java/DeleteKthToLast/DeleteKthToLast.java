import java.io.*;
import java.util.*;

class DeleteKthToLast {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for ( int i = 0; i < n; i++) {
			int x = sc.nextInt();
			list.add(x);
		}
		int k = sc.nextInt();
		ListNode head = ListNode.createList(list);
		head = Solution.deleteKthToLast(head, k);
		List<Integer> result = ListNode.extractList(head);
		for ( int i = 0; i < result.size(); i++) {

			System.out.print(result.get(i) + " ");
		}
	}
}

