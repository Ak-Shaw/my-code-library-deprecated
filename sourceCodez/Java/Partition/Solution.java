import java.io.*;
import java.util.*;

/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/

class Solution {
  public static ListNode partition( ListNode head , int x) {

  	// If list is empty or contains only one element.
  	if (head == null || head.next == null) {
  		return head;
  	}

  	ListNode dummy1 = new ListNode(0);
  	ListNode dummy2 = new ListNode(0);
  	ListNode dummy3 = new ListNode(0);

  	ListNode tail1 = dummy1;
  	ListNode tail2 = dummy2;
  	ListNode tail3 = dummy3;

  	while (head != null) {

  		ListNode[] splitResult = splitList(head, 1);

  		ListNode node = splitResult[0];
  		head = splitResult[1];

  		if (node.val < x) {

  			tail1 = appendNodeAtTail(tail1, node);

  		} else if (node.val == x) {

  			tail2 = appendNodeAtTail(tail2, node);

  		} else { // if node.val > x

  			tail3 = appendNodeAtTail(tail3, node);
  		}

  	}

  	// Getting rid of dummy node.
  	ListNode subList1 = dummy1.next;
  	ListNode subList2 = dummy2.next;
  	ListNode subList3 = dummy3.next;

  	return combineThreeSublists(subList1, subList2, subList3, tail1, tail2, tail3);

  }

  // According to truth table of three operands, 8 scenarios can occur.
  // A B C
  // 0 0 0 
  // 0 0 1
  // 0 1 0
  // 0 1 1
  // 1 0 0
  // 1 0 1
  // 1 1 0
  // 1 1 1
  public static ListNode combineThreeSublists(ListNode subList1, ListNode subList2, ListNode subList3, ListNode tail1, ListNode tail2, ListNode tail3) {

  	if (subList1 == null && subList2 == null) {

  		return subList3;

  	}

  	if (subList1 == null && subList3 == null) {

  		return subList2;

  	}

  	if (subList2 == null && subList3 == null) {

  		return subList1;

  	}

  	if (subList1 == null) {

  		tail2.next = subList3;

  		return subList2;

  	}

  	if (subList2 == null) {

  		tail1.next = subList3;

  		return subList1;
  	}

  	if (subList3 == null) {

  		tail1.next = subList2;

  		return subList1;
  	}

  	tail1.next = subList2;
  	tail2.next = subList3;

  	return subList1;
  }

  public static ListNode appendNodeAtTail(ListNode tail, ListNode node) {

  	tail.next = node;

  	tail = tail.next;

  	return tail;
  }

  public static ListNode[] splitList(ListNode head, int i) {

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
}
