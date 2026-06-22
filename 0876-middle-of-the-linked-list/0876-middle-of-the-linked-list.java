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
    public ListNode middleNode(ListNode head) {
        ListNode current = head ;
        int count = 1;
        while (current.next != null ){
            current = current.next;
            count++;
        }
        current = head ;
        int mid = 0;
        if(count % 2 == 0 ){
            mid = count/2 + 1;
        }
        else{
            mid = count/2 + 1 ;
            
        }
        for(int i=0; i<mid-1; i++ ){
            current = current.next;
        }
        return current;
    }
}