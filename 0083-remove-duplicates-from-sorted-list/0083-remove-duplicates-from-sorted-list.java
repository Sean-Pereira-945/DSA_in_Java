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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode Curr = head;
        while(Curr != null && Curr.next != null ){
            if(Curr.val == Curr.next.val){
                Curr.next = Curr.next.next;
            }
            else{Curr = Curr.next;}
        }

        return head;
    }
}