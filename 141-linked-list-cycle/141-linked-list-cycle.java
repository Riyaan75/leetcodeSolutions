/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
      public boolean hasCycle(ListNode head) {
          ListNode slow,fast;
          slow=fast=head;
          if(head==null||head.next==null)
              return false;
          while(slow!=null&fast!=null&&fast.next!=null){
              slow=slow.next;
              fast=fast.next.next;
              if(slow==fast)
                  return true;
          }
          return false;
      }
    
//     public boolean hasCycle(ListNode head) {
//         ListNode t=head;
//         HashMap<ListNode,Boolean> visited=new HashMap<>();
//         while(t!=null){
//             ListNode ref=t;
//             if(visited.get(ref)!=null)
//                 return true;
//             visited.put(ref,true);
//             t=t.next;
//         }
//         return false;
//     }
}