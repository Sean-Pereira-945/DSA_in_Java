class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0, head);

        ListNode curr = dummy;
        while (curr.next != null && curr.next.next != null) {
            
            if (curr.next.val == curr.next.next.val) {

                int duplicateVal = curr.next.val;
                
                while (curr.next != null && curr.next.val == duplicateVal) {
                    curr.next = curr.next.next; 
                }
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}