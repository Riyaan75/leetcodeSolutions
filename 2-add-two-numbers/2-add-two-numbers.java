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
        
        var result = new ListNode();
        var plus = false;
        var cur = result;
        
        while (l1 != null || l2 != null || plus) {
            
            if (l1 != null) {
                cur.val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                cur.val += l2.val;
                l2 = l2.next;
            }
            if (plus) {
                ++cur.val;
                plus = false;
            }
            if (cur.val >= 10) {
                cur.val -= 10;
                plus = true;
            }
            if (l1 != null || l2 != null || plus) {
                cur.next = new ListNode();
                cur = cur.next;
            }
        }
        return result;
    }
}