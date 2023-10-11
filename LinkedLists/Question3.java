package LinkedLists;

public class Question3 {
    public static class Node{
        int val;
        Node next;
    
        Node(int val){
            this.val = val;
        }
        Node(int val, Node next){
            this.val = val;
            this.next = next;
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

    public static void print(){
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.val+" -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static void swap(Node x, Node y){
        Node A = head, B = head;

        Node ptr = head;

        while(ptr != null){
            if(ptr.next == x) A = ptr;
            if(ptr.next == y) B = ptr;

            ptr = ptr.next;
        }

        B.next = x;
        A.next = y;

        A = x.next;
        B = y.next;

        x.next = B;
        y.next = A;
    }

    public static void main(String[] args) {
        Node six = new Node(6);
        Node five = new Node(5, six);
        Node four = new Node(4, five);
        Node three = new Node(3, four);
        Node two = new Node(2,three);
        Node one = new Node(1, two);
        head = one;

        print();

        swap(two , six);
        print();

    }
}
