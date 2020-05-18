import java.util.*;
import java.io.*;

class DeleteMiddleNode {
    public static ListNode get_kth_element(ListNode head, int k) {
        for(int i = 1 ; i < k ; ++i) {
            head = head.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; ++i) {
            int x = scanner.nextInt();
            list.add(x);
        }
        int k = scanner.nextInt();
        scanner.close();

        ListNode head = ListNode.createList(list);
        ListNode node = get_kth_element(head, k);
        Solution.deleteMiddleNode(node);

        List<Integer> res = ListNode.extractList(head);
        for(int element: res) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
