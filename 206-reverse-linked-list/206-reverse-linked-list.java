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
    public int len(ListNode head){
        ListNode t=head;
        int c=0;
        while(t!=null){
            t=t.next;
            c++;
        }
        return c;
    }
    public ListNode getNode(int i,ListNode head){
        ListNode temp=head;
        for(int j=0;j<i;j++){
            if(temp.next!=null)
                temp=temp.next;
        }
        return temp;
    }
    public ListNode reverseList(ListNode head) {
        int i=0;
        int j=len(head)-1;
        while(i<j){
            ListNode leftNode=getNode(i,head);
            ListNode rightNode=getNode(j,head);
            
            int temp=leftNode.val;
            leftNode.val=rightNode.val;
            rightNode.val=temp;
            i++;
            j--;
            
        }
        return head;
    }
}