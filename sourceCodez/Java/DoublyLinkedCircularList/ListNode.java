
import java.io.*;
import java.util.*;
// CRIO_SOLUTION_AND_STUB_START_MODULE_LINKED_LIST_RANDOM_REVERSAL
// CRIO_SOLUTION_AND_STUB_END_MODULE_LINKED_LIST_RANDOM_REVERSAL

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; next = null; }

    public static ListNode createList(List<Integer> numbers) {
        if (numbers.size() == 0)
            return null;

        ListNode head = new ListNode(numbers.get(0));
        ListNode node = head;

        for (int i = 1; i < numbers.size(); ++i) {
            node.next = new ListNode(numbers.get(i));
            node = node.next;
        }

        return head;
    }

    public static List<Integer> extractList(ListNode head) {
        List<Integer> lst = new ArrayList<Integer>();

        while(head != null) {
            lst.add(head.val);
            head = head.next;
        }

        return lst;
    }
}
