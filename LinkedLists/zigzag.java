package LinkedLists;

public class zigzag {
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

    public static void print(){
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.val+" -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static void zigZag() {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node cur = slow.next;
        slow.next = null;
        Node next;

        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        Node rightH = prev;
        Node leftH = head;
        Node left, right;

        while(rightH != null){
            left = leftH.next;
            leftH.next = rightH;
            right = rightH.next;
            rightH.next = left;

            leftH = left;
            rightH = right;
        }
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);

        print();

        zigZag();
        print();
    }
}
