package LinkedLists;

public class Question2 {

    
    // https://practice.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/1


    static void linkdelete(Node head, int M, int N)
    {
        int m, n;
        Node ptr = head;
        while(ptr != null && ptr.next != null){
            m = M;
            n = N+1;
            while(m != 1 && ptr.next != null){
                ptr = ptr.next;
                m--;
            }
            
            Node next = ptr;
            while(n != 0 && next != null){
                next = next.next;
                n--;
            }
            ptr.next = next;
            ptr = ptr.next;
        }
    }
    public static void main(String[] args) {
        
    }
}
