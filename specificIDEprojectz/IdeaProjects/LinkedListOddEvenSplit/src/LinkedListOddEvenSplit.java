import java.util.*;
import java.io.*;

class LinkedListOddEvenSplit {

    public static void test_do_odd_even_split()
    {
        // empty list split
        {

            ListNode[] res = Solution.do_odd_even_split(null, 1);
            assert res[0] == null;
            assert res[1] == null;
        }

        // single element
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);
            ListNode head = ListNode.createList(arr);
            ListNode[] res = Solution.do_odd_even_split(head, 1);
            assert res[0] != null;
            assert res[0].val == 1;
            assert res[1] == null;
        }

        // two element
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);
            arr.add(2);

            ListNode head = ListNode.createList(arr);
            ListNode[] res = Solution.do_odd_even_split(head, 1);
            assert res[0] != null;
            assert res[0].val == 1;
            assert res[1] != null;
            assert res[1].val == 2;
        }
        // 5 element split
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            arr.add(5);

            ListNode head = ListNode.createList(arr);
            ListNode[] res = Solution.do_odd_even_split(head, 1);
            assert res[0] != null;
            assert res[0].val == 1;
            assert res[0].next.val == 3;
            assert res[0].next.next.val == 5;
            assert res[0].next.next.next == null;
            assert res[1].val == 2;
            assert res[1].next.val == 4;
            assert res[1].next.next == null;
        }
    }

    public static void test_find_meeting_point()
    {
        // empty list
        {
            ListNode res = Solution.find_meeting_point(null);
            assert res == null;
        }
        // list with no loop
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);

            ListNode head = ListNode.createList(arr);
            assert null == Solution.find_meeting_point(head);
        }

        // 1 -> 2 -> 3 -> {2}
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);
            arr.add(2);
            arr.add(3);

            ListNode head = createListWithLoop(arr, 2);
            ListNode res = Solution.find_meeting_point(head);
            assert res != null;
        }
    }

    public static void test_break_loop()
    {
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);

            ListNode head = createListWithLoop(arr, 1);
            ListNode res = Solution.break_loop(head, head);

            assert res != null;
            assert res.val == 1;
            assert res.next == null;
        }
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);
            arr.add(2);
            arr.add(3);

            ListNode head = createListWithLoop(arr, 2);
            ListNode res = Solution.break_loop(head, head.next);
            assert res.next.next.next == null;
            assert res.val == 1;
            assert res.next.val == 2;
            assert res.next.next.val == 3;
        }
    }

    public static void test_find_loop_start()
    {
        // loop starts at node 1
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);
            arr.add(2);
            arr.add(3);

            ListNode head = createListWithLoop(arr, 1);

            ListNode meeting_point = head.next;
            head.next = null;

            Pair res = Solution.find_loop_start(head, meeting_point);
            int res_index = res.getX();
            ListNode res_node = res.getY();
            assert res_index == 1;
            assert res_node != null;
            assert res_node.val == 1;
        }

        // loop starts at node 2
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);
            arr.add(2);
            arr.add(3);

            ListNode head = createListWithLoop(arr, 2);

            ListNode meeting_point = head.next.next;
            head.next.next = null;

            Pair res = Solution.find_loop_start(head, meeting_point);
            int res_index = res.getX();
            ListNode res_node = res.getY();
            assert res_index == 2;
            assert res_node != null;
            assert res_node.val == 2;
        }

        // loop starts at node 3
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);
            arr.add(2);
            arr.add(3);

            ListNode head = createListWithLoop(arr, 3);

            ListNode meeting_point = head.next.next.next;
            head.next.next.next = null;
            Pair res = Solution.find_loop_start(head, meeting_point);
            int res_index = res.getX();
            ListNode res_node = res.getY();

            assert res_index == 3;
            assert res_node != null;
            assert res_node.val == 3;
        }
    }


    private static ListNode createListWithLoop(List<Integer> numbers, int k) {
        if(k == -1) {
            return ListNode.createList(numbers);
        }
        ListNode head = new ListNode(numbers.get(0));
        ListNode current = head;
        ListNode kth_node = null;

        --k;
        if(k == 0) {
            kth_node = current;
        }
        for(int i = 1 ; i < numbers.size() ; ++i) {
            current.next = new ListNode(numbers.get(i));
            current = current.next;
            --k;
            if(k == 0) {
                kth_node = current;
            }
        }
        current.next = kth_node;
        return head;
    }
    private static void print_list(ListNode head) {
        List<Integer> list = ListNode.extractList(head);
        System.out.println(list.size());
        for(int x: list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        test_do_odd_even_split();
        test_find_meeting_point();
        test_break_loop();
        test_find_loop_start();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; ++i) {
            list.add(scanner.nextInt());
        }
        scanner.close();

        ListNode head = createListWithLoop(list, k);
        ListNode[] result = new Solution().split_list_by_odd_or_even(head);

        print_list(result[0]);
        print_list(result[1]);
    }
}
