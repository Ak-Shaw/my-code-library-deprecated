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
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode ptr1 = head1;
        SinglyLinkedListNode ptr2 = head2;

        while (ptr1 != ptr2) {

            if (ptr1 == null) {

                ptr1 = head2;
            
            } else {

                ptr1 = ptr1.next;
            } 

            if (ptr2 == null) {

                ptr2 = head1;
            
            } else {

                ptr2 = ptr2.next;
            }
        }

        return ptr1.data;
    }
}