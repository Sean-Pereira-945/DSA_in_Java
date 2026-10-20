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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode ptr = head ;
        if(head.next == null) return null; 
        while (ptr.next != null){
            count ++;
            ptr = ptr.next;
        }
        ListNode curr = head;
        int posToDelete = count - n + 1;
        if(posToDelete == 1) {
            head = head.next;
            return head;
        }
        for(int i=1; i<posToDelete-1; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head ;
    }
}