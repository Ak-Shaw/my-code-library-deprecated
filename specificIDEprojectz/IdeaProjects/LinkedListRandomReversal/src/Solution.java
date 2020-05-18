
class Solution {

    public static void print_list(ListNode head) {
        System.out.print("List : ");
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public ListNode performRandomReversal(ListNode head, int[] nums) {

        ListNode requiredHead = null;
        ListNode requiredTail = null;

        for (int i=0; i < nums.length && head != null; i++) {

            ListNode[] split = split_list(head, nums[i]);

            head = split[1];

            ListNode[] reverse = reverse_linked_list(split[0]);

            ListNode[] append = append_reversed_list_to_result
                    (requiredHead, requiredTail, reverse[0], reverse[1]);

            requiredHead = append[0];
            requiredTail = append[1];
        }

        // append the remaining list if any
        if (head != null) {
            requiredTail.next = head;
        }

        return requiredHead;
    }

    public static ListNode[] reverse_linked_list(ListNode head) {

        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        ListNode last = head;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;

        ListNode[] result = {head, last};

        return result;

    }



    public static ListNode[] split_list(ListNode head, int i) {

        ListNode part1 = null;
        ListNode part2 = null;

        ListNode[] result = {part1, part2};

        if (head == null) {
            return result;
        }

        // storing a dummy value in part1
        part1 = new ListNode(0);

        ListNode node = part1;

        int j = 0;

        while (j<i && head != null) {

            node.next = new ListNode(head.val);
            node = node.next;

            head = head.next;

            j++;
        }

        // removing the earlier stored dummy value in part1
        part1 = part1.next;

        part2 = head;
        ListNode[] resultOfSplit = {part1, part2};

        return resultOfSplit;

    }

    public static ListNode[] append_reversed_list_to_result(
	    	ListNode headOfListBuiltSoFar, 
	    	ListNode tailOfListBuiltSoFar, 
	    	ListNode newReversalHead, 
	    	ListNode newReversalTail) {

        ListNode[] nullResult = {null, null};

        if (headOfListBuiltSoFar == null && tailOfListBuiltSoFar == null &&
                newReversalHead == null && newReversalTail == null) {
            return nullResult;
        }

        if (headOfListBuiltSoFar == null && tailOfListBuiltSoFar == null) {
            ListNode[] secondListIsResultant = {newReversalHead, newReversalTail};

            return secondListIsResultant;
        }

        if (newReversalHead == null && newReversalTail == null) {

            ListNode[] firstListIsResultant = {headOfListBuiltSoFar, tailOfListBuiltSoFar};

            return firstListIsResultant;
        }

        tailOfListBuiltSoFar.next = newReversalHead;

        ListNode[] result = {headOfListBuiltSoFar, newReversalTail};

        return result;

    }

}
