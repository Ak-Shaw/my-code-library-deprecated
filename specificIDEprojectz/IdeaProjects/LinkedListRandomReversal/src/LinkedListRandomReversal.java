import java.io.*;
import java.util.*;

class LinkedListRandomReversal {
    public static void test_reverse_linked_list() {
        // empty list test
        {
            ListNode[] res = Solution.reverse_linked_list(null);
            assert res[0] == null;
        }

        // one element test
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);

            ListNode head = ListNode.createList(arr);
            ListNode[] res = Solution.reverse_linked_list(head);

            assert res[0] != null;
            assert res[0].val == 1;
            assert res[0].next == null;
        }
        // two element test
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);
            arr.add(2);
            ListNode head = ListNode.createList(arr);
            ListNode[] res = Solution.reverse_linked_list(head);

            assert res[0] != null;
            assert res[0].val == 2;
            ListNode second = res[0].next;
            assert second != null;
            assert second.val == 1;
            assert second.next == null;
        }

        // five element test
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            arr.add(5);

            ListNode head = ListNode.createList(arr);
            ListNode[] res = Solution.reverse_linked_list(head);

            assert res[0] != null;
            assert res[0].val == 5;
            ListNode second = res[0].next;
            assert second != null;
            assert second.val == 4;
            assert second.next != null;
            ListNode fifth = res[0].next.next.next.next;
            assert fifth.val == 1;
            assert fifth.next == null;
            assert res[1].val == 1;
            assert res[1].next == null;
        }
    }

    public static void test_split_list() {
        // empty list test
        {
            ListNode[] res = Solution.split_list(null, 1);

            assert res[0] == null;
            assert res[1] == null;
        }

        // one element test [1, 0]
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);

            ListNode head = ListNode.createList(arr);
            ListNode[] res = Solution.split_list(head, 1);

            assert res[0] != null;
            assert res[0].val == 1;
            assert res[0].next == null;
            assert res[1] == null;
        }

        // one element test, [0, 1]
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);

            ListNode head = ListNode.createList(arr);
            ListNode[] res = Solution.split_list(head, 0);

            assert res[1] != null;
            assert res[1].val == 1;
            assert res[1].next == null;
            assert res[0] == null;
        }
        // two element test, [2, 0]
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);
            arr.add(2);
            ListNode head = ListNode.createList(arr);
            ListNode[] res = Solution.split_list(head, 2);

            assert res[0] != null;
            assert res[0].val == 1;
            assert res[0].next != null;
            assert res[0].next.val == 2;
            assert res[0].next.next == null;
            assert res[1] == null;
        }
        // two element test, [1, 1]
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);
            arr.add(2);
            ListNode head = ListNode.createList(arr);
            ListNode[] res = Solution.split_list(head, 1);

            assert res[0] != null;
            assert res[0].val == 1;
            assert res[0].next == null;
            assert res[1].val == 2;
            assert res[1].next == null;
        }
        // two element test, [0, 2]
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);
            arr.add(2);
            ListNode head = ListNode.createList(arr);
            ListNode[] res = Solution.split_list(head, 0);

            assert res[1] != null;
            assert res[1].val == 1;
            assert res[1].next != null;
            assert res[1].next.val == 2;
            assert res[1].next.next == null;
            assert res[0] == null;
        }
    }

    public static void test_append_reversed_list_to_result() {
        ListNode result_head = null;
        ListNode result_tail = null;

        {
            ListNode[] res0 = Solution.append_reversed_list_to_result(result_head, result_tail, null, null);
            result_head = res0[0];
            result_tail = res0[1];
            assert result_head == null;
            assert result_tail == null;

            ArrayList<Integer> arr1 = new ArrayList<Integer>();
            arr1.add(1);
            arr1.add(2);
            arr1.add(3);

            ListNode list1 = ListNode.createList(arr1);

            ListNode[] res = Solution.append_reversed_list_to_result(result_head, result_tail, list1, list1.next.next);
            result_head = res[0];
            result_tail = res[1];

            List<Integer> expected_arr1 = ListNode.extractList(result_head);
            // now the lsit should look like 1->2->3->null
            assert expected_arr1.get(0) == arr1.get(0);
            assert expected_arr1.get(1) == arr1.get(1);
            assert expected_arr1.get(2) == arr1.get(2);

            ArrayList<Integer> arr2 = new ArrayList<Integer>();
            arr2.add(4);
            arr2.add(5);

            ListNode list2 = ListNode.createList(arr2);
            res = Solution.append_reversed_list_to_result(result_head, result_tail, list2, list2.next);
            result_head = res[0];
            result_tail = res[1];

            List<Integer> expected_arr2 = ListNode.extractList(result_head);
            // now the lsit should look like 1->2->3->4->5->null
            assert expected_arr1.get(0) == arr1.get(0);
            assert expected_arr1.get(1) == arr1.get(1);
            assert expected_arr1.get(2) == arr1.get(2);
            assert expected_arr2.get(3) == arr2.get(0);
            assert expected_arr2.get(4) == arr2.get(1);

            res = Solution.append_reversed_list_to_result(result_head, result_tail, null, null);
            result_head = res[0];
            result_tail = res[1];
            // now the lsit should look like 1->2->3->4->5->null
            assert expected_arr1.get(0) == arr1.get(0);
            assert expected_arr1.get(1) == arr1.get(1);
            assert expected_arr1.get(2) == arr1.get(2);
            assert expected_arr2.get(3) == arr2.get(0);
            assert expected_arr2.get(4) == arr2.get(1);
        }
    }

    public static void main(String[] args) {

        test_reverse_linked_list();
        test_split_list();
        test_append_reversed_list_to_result();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; ++i) {
            list.add(scanner.nextInt());
        }
        int k = scanner.nextInt();
        int[] nums = new int[k];
        for(int i = 0 ; i < k ; ++i) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        ListNode head = ListNode.createList(list);
        ListNode result = new Solution().performRandomReversal(head, nums);

        List<Integer> resultList = ListNode.extractList(result);
        System.out.println(resultList.size());
        for(int x: resultList) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
