/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        Stack<ListNode> s1 = getListStack(l1);
        Stack<ListNode> s2 = getListStack(l2);
        
        if (s1.size() > s2.size()) {
            
            return getResultList(s1, s2);
        }
        
        return getResultList(s2, s1);
        
    }
    
    public Stack<ListNode> getListStack(ListNode listNode) {
        
        Stack<ListNode> listStack = new Stack<ListNode>();
        
        while(listNode != null) {
            
            listStack.push(listNode);
            listNode = listNode.next;
        }
        
        return listStack;
    }
    
    public ListNode getResultList(Stack<ListNode> s1, Stack<ListNode> s2) {
        
        ListNode resultList = null;
        
        int carry = 0;
        
        while (!s1.empty() && !s2.empty()) {
            
            
            int val1 = s1.pop().val;
            int val2 = s2.pop().val;
            
            int sum = val1 + val2 + carry;
            
            //19
            int result = sum % 10;
            carry = sum / 10;
            
            
            resultList = appendInfront(resultList, new ListNode(result));
        }
        
        while (!s1.empty()) {
            
            int sum = s1.pop().val + carry;
            
            int result = sum % 10;
            
            carry = sum / 10;
            
            resultList = appendInfront(resultList, new ListNode(result));
        }
        
        if (carry == 1) {
            
            resultList = appendInfront(resultList, new ListNode(1));
        }
        
        return resultList;
    }
    
    
    public ListNode appendInfront(ListNode resultList, ListNode node) {
        
        node.next = resultList;
        resultList = node;
        
        return resultList;
    }
}
