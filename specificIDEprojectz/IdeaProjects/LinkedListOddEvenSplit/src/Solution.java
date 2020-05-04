
import java.util.HashSet;

public class Solution {
    // TODO: CRIO_TASK_MODULE_LINKED_LIST_ODD_EVEN_SPLIT
    // Input:
    //      1. given linked list head pointer
    //      2. node where loop starts
    //
    // Task:
    //      break the loop
    // TODO: CRIO_TASK_MODULE_LINKED_LIST_ODD_EVEN_SPLIT
    // Input:
    //      head of a singly linked list
    // Task:
    //      1. slow runner traverse the linked list one node at a time
    //      2. fast runner traverse the linked list two node at a time
    //      3. If slow runner and fast runner meet at some node then return that node
    //      4. Else return null(they don't meet and linked list ends).
    // Output:
    //      return the node they both meet. null if the list has is null terminated
    // TODO: CRIO_TASK_MODULE_LINKED_LIST_ODD_EVEN_SPLIT
    // Input:
    //      1. given pointer to result list head
    //      2. given pointer to result list tail
    //      3. given head and tail of list to be appended
    //
    // Task:
    //      append the given list to the result list
    //
    // TODO: CRIO_TASK_MODULE_LINKED_LIST_ODD_EVEN_SPLIT
    // Input:
    //      1. given node in a the linked list
    //      2. node position in given linked list(1 based indexing)
    // Task:
    //      split the elements in odd position and even position into two seperate list
    //  Output:
    //      1. head of linked list of all nodes in odd positions
    //      2. head of linked list of all nodes in even positions

    // TODO: CRIO_TASK_MODULE_LINKED_LIST_ODD_EVEN_SPLIT
    // Input:
    //      1. head of linked list
    // Task:
    //      1. if linked list has no loop just split odd position and even position elements
    //      2. if linked list has loop then return all odd position elements in the loop
    //          and even positions elements in the loop
    //  Output:
    //      1. head of linked list of all nodes in odd positions
    //      2. head of linked list of all nodes in even positions

    public ListNode[] split_list_by_odd_or_even(ListNode head) {

        if (head == null) {

            ListNode[] nullHeadResult = {null, null};

            return nullHeadResult;
        }

        ListNode meeting_point = find_meeting_point(head);

        if (meeting_point == null) {

            return do_odd_even_split(head, 1);
        }

        Pair loop_start_pair = find_loop_start_v2(head, meeting_point);

        ListNode loop_start_node = loop_start_pair.getY();

        head = break_loop(head, loop_start_node);

        return do_odd_even_split(head, loop_start_pair.getX());
    }

    public static ListNode[] do_odd_even_split(ListNode head, int i) {

        int k = 1;

        // places pointer at position from where nodes
        // are to be added to both the odd and even
        // positioned elements lists
        while (k < i && head != null) {
            head = head.next;
            k++;
        }

        // placeing a dummy value to both of the lists;
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(0);

        ListNode node1 = list1;
        ListNode node2 = list2;

        int j = 1;

        // extracting the elements and placing them in their
        // respective lists
        while (head != null) {

            if (j % 2 == 0) {

                node2.next = new ListNode(head.val);
                node2 = node2.next;
            } else {

                node1.next = new ListNode(head.val);
                node1 = node1.next;
            }

            j++;
            head = head.next;
        }

        // removing the earlier placed dummy value
        list1 = list1.next;
        list2 = list2.next;

        // if the loop start position is even
        // then "result1" should be returned as result
        if (i % 2 == 0) {

            ListNode[] result1 = {list2, list1};

            return result1;

        }

        ListNode[] result = {list1, list2};

        return result;

    }

    // Floyd's algorithm for finding meeting point
    public static ListNode find_meeting_point(ListNode head) {

        ListNode slowRunner = head;
        ListNode fastRunner = head;

        while (slowRunner != null && fastRunner != null) {

            slowRunner = slowRunner.next;

            try {
                fastRunner = fastRunner.next.next;
            } catch (Exception e) {
                return null;
            }

            if (slowRunner == fastRunner) {
                return slowRunner;
            }
        }

        return null;

    }

    // Floyd's algorithm to find loop size
    public static int find_loop_size(ListNode meeting_point) {

        ListNode runner1 = meeting_point;
        ListNode runner2 = meeting_point;

        runner1 = runner1.next;
        int size = 1;

        while (runner1 != runner2) {

            runner1 = runner1.next;
            size++;
        }

        return size;
    }

    // Floyd's algorithm to find loop start node
    public static Pair find_loop_start_v2(ListNode head, ListNode meeting_point) {

        int loop_size = find_loop_size(meeting_point);

        ListNode runner1 = head;
        ListNode runner2 = head;

        int i = 0;

        while (i < loop_size) {

            runner1 = runner1.next;
            i++;
        }

        int loop_start = 1;

        while (runner1 != runner2) {

            runner1 = runner1.next;
            runner2 = runner2.next;

            loop_start++;
        }

        return new Pair(loop_start, runner1);
    }

    // Floyd's algorithm to find loop start node
    public static Pair find_loop_start(ListNode head, ListNode meeting_point) {

        // rejoining the loop if broken
        {
            boolean hasLoop = detectLoop(head);

            if (!hasLoop) {

                ListNode node = head;

                while (node.next != null) {

                    node = node.next;
                }

                node.next = meeting_point;
            }
        }

        int loop_size = find_loop_size(meeting_point);

        ListNode runner1 = head;
        ListNode runner2 = head;

        int i = 0;

        while (i < loop_size) {

            runner1 = runner1.next;
            i++;
        }

        int loop_start = 1;

        while (runner1 != runner2) {

            runner1 = runner1.next;
            runner2 = runner2.next;

            loop_start++;
        }

        return new Pair(loop_start, runner1);
    }

    static boolean detectLoop(ListNode h)
    {
        HashSet<ListNode> s = new HashSet<ListNode>();
        while (h != null) {

            if (s.contains(h))
                return true;

            s.add(h);

            h = h.next;
        }

        return false;
    }

    public static ListNode break_loop(ListNode head, ListNode loop_start_node) {

        ListNode node = loop_start_node;

        while (node.next != loop_start_node) {

            node = node.next;
        }

        node.next = null;

        return head;
    }

}
