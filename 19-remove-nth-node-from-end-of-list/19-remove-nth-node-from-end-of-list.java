class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode change = head;
        int count = 0;
        int node = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        
        temp = head;
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
}