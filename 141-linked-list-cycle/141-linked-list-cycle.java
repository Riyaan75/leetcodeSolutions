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
        ListNode t=head;
        HashMap<ListNode,Boolean> visited=new HashMap<>();
        while(t!=null){
            ListNode ref=t;
            if(visited.get(ref)!=null)
                return true;
            visited.put(ref,true);
            t=t.next;
        }
        return false;
    }
}