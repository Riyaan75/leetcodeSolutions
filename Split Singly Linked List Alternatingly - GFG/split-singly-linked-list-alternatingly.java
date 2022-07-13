// { Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Node {
    int data;
    Node next;
    
    public Node(int head){
        this.data = head;
        this.next = null;
    }
}

class GFG {
    public static Node a;
    public static Node b;
    
    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    a=null;
		    b=null;
		    int n = sc.nextInt();
		    Node head = new Node(sc.nextInt()), tail = head;
		    while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    Solution obj = new Solution();
		    obj.alternatingSplitList(head);
		    printList(a);
		    printList(b);
		}
	}
}


// } Driver Code Ends


/*
The structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int head){
        this.data = head;
        this.next = null;
    }
}
*/

/*

class GFG {
    public static Node a; //store the head of first list in this
    public static Node b; //store the head of second list in this
}
*/


class Solution {
    public void alternatingSplitList(Node head){
        GFG ob=new GFG();
        if(head.next==null)
        ob.a=head;
       //Your code here
       Node t1=head;
       Node t2=head.next;
       Node t11=t1;
       Node t22=t2;
       while(t2!=null &&t2.next!=null){
           t1.next=t1.next.next;
           t1=t1.next;
           t2.next=t2.next.next;
           t2=t2.next;
       }
       t1.next=null;
       ob.a=t11;
       ob.b=t22;
       
    }
    
}