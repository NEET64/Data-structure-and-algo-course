package LinkedLists;

public class Question4 {
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
    
    public static Node oddEvenList(Node head) {
        Node even = new Node(0);
        Node odd = new Node(1);

        Node ptr = head;
        Node oddH = odd;
        Node evenH = even;
        while(ptr != null){
            if((ptr.val&1)==0){
                even.next = ptr;
                even = ptr;
            }else{
                odd.next = ptr;
                odd = ptr;
            } 
            ptr = ptr.next;
            even.next = null;
            odd.next = null;
        }
        odd.next = evenH.next;
        if(oddH.next == null) return evenH.next;
        return oddH.next;
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);

        print();

        head = oddEvenList(head);
        print();
    }

}
