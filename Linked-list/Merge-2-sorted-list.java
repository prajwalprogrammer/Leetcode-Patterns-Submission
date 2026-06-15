// Problem Link - https://leetcode.com/problems/merge-two-sorted-lists/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a1 = list1;
        ListNode b1 = list2;
        ListNode ans = new ListNode();
        ListNode ans_head = ans;

        while(a1 != null && b1 != null){
            if(a1.val <= b1.val){
                ans.next = a1;
                a1 = a1.next;
            }else{
                ans.next = b1;
                b1 = b1.next;
            }
            ans = ans.next;
        }

        if(a1 != null){
            ans.next = a1;
        }
        if(b1 != null){
            ans.next = b1;
        }
        return ans_head.next;

    }
}