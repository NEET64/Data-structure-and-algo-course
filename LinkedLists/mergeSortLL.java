package LinkedLists;

public class mergeSortLL {
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

    public static Node merge(Node left, Node right){
        Node temp = new Node(-1);
        Node ptr = temp;

        while(left != null && right != null){
            if(left.val < right.val){
                ptr.next = left;
                left = left.next;
            }else{
                ptr.next = right;
                right = right.next;
            }
            ptr = ptr.next;
        }
        if(left != null) ptr.next = left;
        if(right != null) ptr.next = right;

        return temp.next;
    }

    public static Node mergeSort(Node head){
        if(head.next == null) return head;

        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        Node rightH = slow.next;
        slow.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightH);

        return merge(newLeft, newRight);
    }
    public static void main(String[] args) {
        add(5);
        add(0);
        add(1);
        add(4);
        add(5);
        print();

        head = mergeSort(head);
        print();
    }
}
