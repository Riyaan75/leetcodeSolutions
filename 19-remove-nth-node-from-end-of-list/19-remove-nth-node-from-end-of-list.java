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
         ListNode change=head;
        ListNode temp=head;
        int count= len(head);
       int node=0;
                while(temp != null) {
            node++;
            if(n == count)  {
                return head.next;
            }
            if(node == count - n) {
                change = temp;
            }
            if(node == count - n + 1)   {
                change.next = temp.next;
            }
            temp = temp.next;
        }
        
        return head;
    }
    private int len(ListNode t){
        int c=0;
        while(t!=null){
            c++;
            t=t.next;
        }
        return c;
    }
}