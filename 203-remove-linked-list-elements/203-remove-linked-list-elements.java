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
        while(head!=null && head.val==val)
            head=head.next;
        ListNode chead=head;
        while(chead!=null && chead.next!=null){
            if(chead.next.val==val){
                chead.next=chead.next.next;
            }
            else
                chead=chead.next;
            
        }
        return head;
    }
}