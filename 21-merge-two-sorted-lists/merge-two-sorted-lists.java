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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(-1);
        ListNode result = res;
        int got = 0;

        if(list1 == null && list2 == null) {
            return null;
        }

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                res.next = list1;
                list1 = list1.next;
                got++;
            } else {
                res.next = list2;
                list2 = list2.next;
                got++;
            }
            if(got == 1) {
                result = res.next;
            }
            res = res.next;
        }

        while(list1 != null) {
            got++;
            res.next = list1;
            list1 = list1.next;
            if(got == 1) {
                result = res.next;
            }
            res = res.next;
        }

        while(list2 != null) {
            got++;
            res.next = list2;
            list2 = list2.next;
            if(got == 1) {
                result = res.next;
            }
            res = res.next;
        }

        return result;

    }
}