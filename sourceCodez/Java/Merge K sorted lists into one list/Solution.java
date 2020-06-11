/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/

import java.io.*;
import java.util.*;
import crio.ds.List.ListNode;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

    	PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((node1, node2) -> node1.val - node2.val);

    	for (int i = 0; i < lists.length; i++) 
    		pq.add(lists[i]);

    	ListNode head = null, last = null;

    	while (!pq.isEmpty()) {

    		ListNode min = pq.poll();

    		if (head == null) {

    			head = last = min;
    		}

    		else {

    			last.next = min;

    			last = min;
    		}

    		if (min.next != null)

    			pq.add(min.next);
    	}

    	return head;
    }

}

