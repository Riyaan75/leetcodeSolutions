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
    
    private boolean compare(ListNode first,ListNode second){
        while(first!=null && second !=null){
           if(first.val!=second.val)
               return false;
            first=first.next;
            second = second.next;
        }
        return true;
    }
    
    private ListNode reverse(ListNode current,ListNode prev){
        if(current == null)
            return prev;
        ListNode ahead=current.next;
        current.next=prev;
        return reverse(ahead,current);
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head.next==null)
            return true;
//         Steps 
//         1 find Mid
//         2 Reverse second half of the ll
//         3 split compare 2 list
//         4 reverse second half of original list
        ListNode slow,fast;
        ListNode prev=null;
        ListNode mid=null;
        slow = fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            prev = slow;
            slow = slow.next;
            
        }
        //for odd number of nodes
        if(fast!=null){
            mid=slow;
            slow=slow.next;
        }
        // Create SecondHalf of the list
        ListNode secondHalf = slow;
        //separating first half 
        prev.next=null;
        //reverse the second half ll
        secondHalf=reverse(secondHalf,null);
        //compare first and second half of ll
        boolean result = compare(head,secondHalf);
        // Reverse again
        secondHalf=reverse(secondHalf,null);
        // merging LL parts again
        if(mid!=null){
        prev.next=mid;
        mid.next=secondHalf;
        }
        
        return result;
        
        
    }
}