/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode aLen = headA;
        ListNode bLen = headB;
        int count1 = 0, count2 = 0;

        while(aLen != null) {
            aLen = aLen.next;
            count1++;
        }

        while(bLen != null) {
            bLen = bLen.next;
            count2++;
        }

        int diff = Math.abs(count1 - count2);

        if(count1 >= count2) {
            for(int i=0;i<diff;i++) {
                headA = headA.next;
            }
        }
        else {
           for(int i=0;i<diff;i++) {
                headB = headB.next;
            } 
        }

        while(headA != null && headB != null) {
            if(headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}