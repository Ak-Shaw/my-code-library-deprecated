public class Solution {

	/*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {

        HashSet<SinglyLinkedListNode> s = new HashSet<SinglyLinkedListNode>();
        while (head != null) {

            if (s.contains(head))
                return true;

            s.add(head);

            head = head.next;
        }

        return false;


    }
}