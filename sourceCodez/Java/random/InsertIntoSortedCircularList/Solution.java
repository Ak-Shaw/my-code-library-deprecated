/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/
import java.util.*;

class Solution{
	public ListNode insertIntoSortedCircularList(ListNode head,int insertVal)
	{

		if (head == null) {

			return createCircularListWithOneValue(insertVal);
		}

		ListNode nodeWithSmallestValue = getNodeWithSmallestValue(head);

		ListNode node1 = nodeWithSmallestValue;
		ListNode node2 = nodeWithSmallestValue.next;

		while (node2 != nodeWithSmallestValue) {

			if (node1.val <= insertVal && node2.val >= insertVal) {

				insertValueAfterNode(insertVal, node1);
				return head;
			}

			node1 = node2;
			node2 = node2.next;
		}

		insertValueAfterNode(insertVal, node1);
		return head;
	}

	public ListNode createCircularListWithOneValue(int val) {

		ListNode node = new ListNode(val);

		node.next = node;

		return node;
	}

	public void insertValueAfterNode(int val, ListNode node) {

		ListNode newNode = new ListNode(val);

		newNode.next = node.next;

		node.next = newNode;
	}

	public ListNode getNodeWithSmallestValue(ListNode node) {

		if (node == null) {

			return null;
		}

		ListNode nodeWithSmallestValue = node;

		ListNode node1 = node.next;

		while (node1 != node) {

			if (node1.val < nodeWithSmallestValue.val) {
				nodeWithSmallestValue = node1;
			}

			node1 = node1.next;
		}

		return nodeWithSmallestValue;
	}
}
