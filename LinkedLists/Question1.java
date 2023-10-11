package LinkedLists;
import java.util.*;
public class Question1 {
    public static class Node{
        int val;
        Node next;
    
        Node(int val){
            this.val = val;
        }
    }
    public static Node head;

    public static void add(int val){
        Node n = new Node(val);
        if(head == null){
            head = n;
            return;
        }
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = n;
    }

    public Node getIntersectionNode(Node headA, Node headB) {
        
        Node ptr1 = headA;
        Node ptr2 = headB;

        Stack<Node> A = new Stack<Node>();
        Stack<Node> B = new Stack<Node>();

        while(ptr1 != null){
            A.push(ptr1);
            ptr1 = ptr1.next;
        }
        while(ptr2 != null){
            B.push(ptr2);
            ptr2 = ptr2.next;
        }

        while(!A.isEmpty() && !B.isEmpty()){
            ptr1 = A.pop();
            ptr2 = B.pop();
            if(ptr1 != ptr2) return ptr1.next; 
        }
        if(ptr1 != null) return ptr1;
        if(ptr2 != null) return ptr2;
        else return null;
    }
    public static void main(String[] args) {
        
    }
}
