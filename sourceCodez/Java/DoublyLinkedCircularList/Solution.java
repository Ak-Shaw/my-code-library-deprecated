import java.io.*;
import java.util.*;
/*
// Definition for ListNode
public class ListNode {

    public int val;
    public ListNode next;
    ListNode() {}
    ListNode(int x) {
        val = x;
        next = null;
    }
};
// Definition for DoublyLinkedListNode
public class DoublyLinkedListNode {
    int val;
    DoublyLinkedListNode prev;
    DoublyLinkedListNode next;

    DoublyLinkedListNode(int x, DoublyLinkedListNode p=null, DoublyLinkedListNode n=null) {
        val = x;
        prev = p;
        next = n;
    }
};
*/

class Solution {
	public static DoublyLinkedListNode doublyLinkedCircularList(ListNode head) {

        if (head == null) {
            return null;
        }

        DoublyLinkedListNode firstNode = new DoublyLinkedListNode(head.val, null, null);

        DoublyLinkedListNode prev = firstNode;

        head = head.next;

        // After this loop, we'll have a doubly 
        // linked list, with prev pointing to lastNode
        while (head != null) {

            DoublyLinkedListNode newNode = new DoublyLinkedListNode(head.val, prev, null);

            prev.next = newNode;

            prev = newNode;

            head = head.next;
        }

        // connecting lastNode and firstNode
        // of doubly linked list
        prev.next = firstNode;
        firstNode.prev = prev;

        return firstNode;
	}
}

