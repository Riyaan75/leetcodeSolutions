/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        traverse(head,head);
        return head;
    }
    static void traverse(Node h1,Node h2){
        Node t=h2;
        while(t!=null){
            if(t.child!=null)
                traverse(t,t.child);
            if(t.next==null){
                if(h1==h2)
                    return;
                merge(h1,t);
                return;
            }
            t=t.next;
        }
    }
    static void merge(Node h1,Node t){
        t.next=h1.next;
        if(h1.next!=null)
            h1.next.prev=t;
        h1.next=h1.child;
        h1.next.prev=h1;
        h1.child=null;
    }
}