/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;

        while(fast != null && fast.next != null) {
            if(slow == fast) {
                if(count == 0) {
                    count++;
                }
                else{
                    return true;
                } 
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}