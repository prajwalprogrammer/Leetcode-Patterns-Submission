public class Remove_Duplicates_from_Sorted_List {
    // Soln 1
    public ListNode deleteDuplicates(ListNode head) {
        ListNode m1 = head;
        while(m1 != null){
            ListNode temp = m1;
            boolean flag = false;
            while(temp.next != null && temp.val == temp.next.val){
                temp = temp.next;
                flag = true;
            }
            if(flag){
                m1.next = temp.next;
                m1 = m1.next;
            }else{
                m1 = m1.next;
            }
        }
        return head;
    }

    // Soln 2
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;

        ListNode curr = head;
        while(curr.next != null){
            if(curr.next != null && curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
}
