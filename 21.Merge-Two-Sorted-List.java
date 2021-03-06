/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // corner case
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode start = new ListNode(0);
        ListNode head = start;
        //
        while (l1!=null && l2!=null) {
            if (l1.val <= l2.val) {
                head.next = l1;
                head = head.next;
                l1 = l1.next;
            } else {
                head.next = l2;
                head = head.next;
                l2 = l2.next;
            }
        }
        
        if (l1 == null) head.next = l2;
        else head.next = l1;
        
        return start.next;
    }
}