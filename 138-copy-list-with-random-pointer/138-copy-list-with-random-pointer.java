/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        Node t;
        t=head;
        //join new node between the nodes
        while(t!=null){
            Node temp=new Node(t.val);
            temp.next=t.next;
            t.next=temp;
            t=t.next.next;
        }
        //fixing random pointer of new node
        t=head;
        while(t!=null){
            if(t.random!=null)
                t.next.random=t.random.next;
            t=t.next.next;
        }
        //making new ll separate from old ll
        Node newhead=head.next;
        head.next=head.next.next;
        t=head.next;
        Node r=newhead;
        while(t!=null){
            r.next=t.next;
            t.next=t.next.next;
            t=t.next;
            r=r.next;
        }
        return newhead;
    }
}