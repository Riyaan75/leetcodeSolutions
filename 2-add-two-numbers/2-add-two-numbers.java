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
    //Approach 1 using demo linkded list and carry
    // public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //     ListNode d=new ListNode();
    //     ListNode t=d;
    //     int car=0;
    //     while(l1!=null || l2!=null || car==1){
    //         int sum=0;
    //         if(l1!=null){
    //             sum+=l1.val;
    //             l1=l1.next;
    //         }
    //         if(l2!=null){
    //             sum+=l2.val;
    //             l2=l2.next;
    //         }
    //         sum+=car;
    //         car=sum/10; 
    //         ListNode node=new ListNode(sum%10);
    //         t.next=node;
    //         t=t.next;
    //     }
    //     return d.next;
    // }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l2_head = l2, l2_end = l2;
        int carry = 0;
        while(l1!=null && l2!=null){
            l2.val = l2.val + l1.val + carry;
            if(l2.val>=10){
                carry = 1;
                l2.val-=10;
            }
            else {
                carry = 0;
            }
            l2_end = l2;
            l2 = l2.next;
            l1 = l1.next;
        }
        while(l1!=null){
            l1.val = l1.val + carry;
            if(l1.val>=10){
                carry = 1;
                l1.val-=10;
            }
            else {
                carry = 0;
            }
            l2_end.next = l1;
            l2_end = l2_end.next;
            l1 = l1.next;
        }
        
        while(l2!=null){
            l2.val = l2.val + carry;
            if(l2.val>=10){
                carry = 1;
                l2.val-=10;
            }
            else {
                carry = 0;
            }
            l2_end = l2;
            l2 = l2.next;
        }
        if(carry>0) l2_end.next = new ListNode(1);
        return l2_head;
    }
}