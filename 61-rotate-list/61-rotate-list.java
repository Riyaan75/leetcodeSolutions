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
          if(k<=0 || head == null || head.next == null){
            return head;
        }
        ListNode t=head;
        int c=1;
        while(t.next!=null){
            c++;
            t=t.next;
        }
        t.next=head;
        int rot=k%c;
        int skip=c-rot;
        ListNode temp=head;
        for(int i=0;i<skip-1;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}