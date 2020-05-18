/*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */

public class Solution {

    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

        DoublyLinkedListNode prev = null;
        DoublyLinkedListNode current = head;
        DoublyLinkedListNode next = null;
       
        while(current != null) {
            
            next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
            
        }
        
        return prev;
    }

}