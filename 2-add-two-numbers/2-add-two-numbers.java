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
        return addTwoNumbersRecursive(l1,l2,0);
    }
    
    private ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2, int carry)
    {
        if(l1 == null && l2 == null) {
            if(carry != 0) return new ListNode(carry);
            else return null;
        }
        
        int val1 = l1 == null ? 0 : l1.val;
        int val2 = l2 == null ? 0 : l2.val;
        int val = (val1 + val2 + carry) % 10;
        int mod = (val1 + val2 + carry) / 10;
        return new ListNode(val, addTwoNumbersRecursive(l1 == null ? null : l1.next, l2 == null ? null : l2.next, mod));
    }
}