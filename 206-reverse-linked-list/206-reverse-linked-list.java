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
    //Approach 1 3 pointer 
     public ListNode reverseList(ListNode head) {
         if(head==null)
             return head;
         ListNode prev=head;
         ListNode cur=prev.next;
         while(cur!=null){
             ListNode ahead=cur.next;
             cur.next=prev;
             prev=cur;
             cur=ahead;
         }
         ListNode t=head;
         head=prev;
         t.next=null;
         return head;
     }
    
    
    // Approach 2 swapping the values
//     public int len(ListNode head){
//         ListNode t=head;
//         int c=0;
//         while(t!=null){
//             t=t.next;
//             c++;
//         }
//         return c;
//     }
//     public ListNode getNode(int i,ListNode head){
//         ListNode temp=head;
//         for(int j=0;j<i;j++){
//             if(temp.next!=null)
//                 temp=temp.next;
//         }
//         return temp;
//     }
//     public ListNode reverseList(ListNode head) {
//         int i=0;
//         int j=len(head)-1;
//         while(i<j){
//             ListNode leftNode=getNode(i,head);
//             ListNode rightNode=getNode(j,head);        
//             int temp=leftNode.val;
//             leftNode.val=rightNode.val;
//             rightNode.val=temp;
//             i++;
//             j--;
            
//         }
//         return head;
//     }
}