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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null ) return head;
        ListNode t = head ;
        int len = 0;
        while(t != null){
            t = t.next;
            len ++;
        } 
        int times = 0;
        if(k!=0) times = k % len;
        if(times == 0) return head ;
        while (times != 0 ){
            ListNode l = head;
            
            while(l.next.next != null){
                l = l.next;
            }
            //head = l.next;
            l.next.next = head;
            head = l.next;
            l.next = null;
            times--;
        }

        return head;
    }

}