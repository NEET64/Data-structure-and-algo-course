package LinkedLists;

public class DoublyLinkedList {
    static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }

    static Node head;

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
        n.prev = ptr;
    }

    public static void print(){
        Node ptr = head;

        while(ptr!= null){
            System.out.print(ptr.val+" <--> ");
            ptr = ptr.next;
        }
        System.out.println("null ");
    }

    public static void reverse(){
        Node ptr = head;
        Node next;

        while(ptr.next != null){
            next = ptr.next;
            ptr.next = ptr.prev;
            ptr.prev = next;
            ptr = next;
        }
        ptr.next = ptr.prev;
        ptr.prev = null;
        head = ptr;
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);
        print();

        reverse();
        print();
    }
}
