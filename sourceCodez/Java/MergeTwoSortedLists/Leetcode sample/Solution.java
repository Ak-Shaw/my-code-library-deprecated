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
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode merged = new ListNode(0);
        ListNode dummy = merged;
        
        while (l1 != null && l2 != null) {
            
            int a = l1.val;
            int b = l2.val;
            
            if (a < b) {
                
                ListNode newNode = new ListNode(a);
                merged.next = newNode;
                merged = merged.next;
                
                l1 = l1.next;
            
            } else {
                
                ListNode newNode = new ListNode(b);
                merged.next = newNode;
                merged = merged.next;
                
                l2 = l2.next;
                
            }
        }
        
        while (l1 != null) {
            
            ListNode newNode = new ListNode(l1.val);
            merged.next = newNode;
            merged = merged.next;
            
            l1 = l1.next;
        }
        
        while (l2 != null) {
            
            ListNode newNode = new ListNode(l2.val);
            merged.next = newNode;
            merged = merged.next;
            
            l2 = l2.next;
        }
        
        return dummy.next;
    }
}