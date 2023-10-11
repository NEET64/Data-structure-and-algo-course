package LinkedLists;

public class LinkedLists {
    public static class Node{
        int data;
        Node next;

        Node(int n){
            this.data = n;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int n){
        Node newNode = new Node(n);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int n){
        Node newNode = new Node(n);
        size++;
        
        if(tail == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("The list is empty"); 
            return;
        } 
        Node ptr = head;
        
        while(ptr != null){
            System.out.print(ptr.data+" -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
    public void addMiddle(int idx, int data){
        if(head == null || idx == 0){
            addFirst(data);
            return;
        }
        Node nNode = new Node(data);
        size++;
        Node ptr = head;
        int count = 0;

        while(count < idx-1){
            ptr = ptr.next;
            count++;
        }
       
        nNode.next = ptr.next;
        ptr.next = nNode;
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("Underflow condition");
            return Integer.MIN_VALUE;
        }
        else if(head.next == null){
            int val = head.data;
            head = null;
            tail = null;
            System.out.println("empty now");
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        printList();
        return val;
    }

    public int removeLast(){
        Node ptr = head;

        if(head == null){
            System.out.println("underflow");
            return Integer.MIN_VALUE;
        }else if(head.next == null){
            head = null;
            tail = null;
            size = 0;
            System.out.println("empty now");
            return Integer.MIN_VALUE;
        }
        while(ptr.next != tail){
            ptr = ptr.next;
        }
        int val = ptr.next.data;
        ptr.next = null;
        tail = ptr;
        size--;
        printList();
        return val;
    }

    public void search(int k){
        Node ptr = head;
        int count=0;
        while(ptr != null){
            if(ptr.data == k){
                System.out.println("found at "+count);
                return;
            }
            count++;
            ptr = ptr.next;
        }
        System.out.println("Not Found");
        return;
    }

    public int recSearch(Node head, int k){
        if(head == null){
            return -1;
        }
        if(head.data == k){
            return 0;
        }

        int idx = recSearch(head.next, k);
        if(idx == -1) return -1;
        else return idx+1;
    }

    public void reverse(){
        Node pre = null;
        Node next;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        head = pre;
    }

    public void removeNthFromEnd(int n){
        int count = size-n;

        if(count == 0) head = head.next;
        
        Node ptr = head;
        while(count > 1){
            ptr = ptr.next;
            count--;
        }
        ptr.next = ptr.next.next;
    }

    public boolean isPalindrome(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node start = head;

        Node prev = null;
        Node next;
        while(slow!=null){
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        Node end = prev;

        while(end != null){
            if(start.data != end.data) return false;

            start = start.next;
            end = end.next;
        }

        return true;
    }

    public boolean isAnyCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public int cycleNode(){
        if(!isAnyCycle()) return -1;
        
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) break;
        }

        slow = head;
        while(slow.next != fast.next){    //.next ko check karne ka karan exists
            slow = slow.next;
            fast = fast.next;
        }
        return fast.data;    // isko null kare to cycle removed
    }

    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();

        ll.addLast(1);        
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        tail.next = head;

        System.out.println(ll.cycleNode());
    }
}
