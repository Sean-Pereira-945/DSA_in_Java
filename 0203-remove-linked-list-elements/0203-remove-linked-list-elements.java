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
    public ListNode removeElements(ListNode head, int val) {
        ListNode Curr = head;
        while(head != null && head.val == val){
            head = head.next;
        }
        while(Curr != null && Curr.next != null){
            
            if(Curr.next.val == val){ Curr.next = Curr.next.next;}
            else{Curr = Curr.next;}
        }
        

        return head ;
    }
}