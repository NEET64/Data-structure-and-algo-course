package Queue;

public class QueueUsingArray {

    public static class Queue{
        static int queue[];
        static int front;
        static int rear;

        Queue(int size){
            queue = new int[size];
            rear =-1;
        }
        boolean isEmpty(){
            return (rear == -1); 
        }
        void add(int n){
            rear++;
            if(rear >= queue.length){
                rear--;
                System.out.println("is full");
                return;
            }
            queue[rear] = n;
        }

        int remove(){
            if(isEmpty()) return -1;
            int k = queue[0];
            for (int i = 0; i < rear; i++) {
                queue[i] = queue[i+1];
            }
            rear--;
            return k;
        }

        int peek(){
            if(isEmpty()) return -1;
            else return queue[rear];
        }

        void print(){
            for (int i = 0; i <= rear; i++) {
                System.out.print(queue[i]+" ");
            }
        }
        
    }
    
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.add(5);
        q.add(6);
        q.print();
    }
}
