package Queue;

public class CircularQueueUsingArray {
    public static class CQueue{
        static int queue[];
        static int front;
        static int rear;
        int size;

        CQueue(int size){
            queue = new int[size];
            this.size = size;
            front = -1;
            rear = -1;
        }
        boolean isEmpty(){
            return (rear == front); 
        }
        void add(int n){
            if((rear+1)%size == front){
                System.out.println("is full");
                return;
            }
            if(rear == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            queue[rear] = n;
        }

        int remove(){
            if(isEmpty()){
                front = rear = -1;
                return -1;
            }
            int k = queue[front];
            front = (front+1)%size;
            return k;
        }

        int peek(){
            if(isEmpty()) return -1;
            else return queue[rear];
        }

        void print(){
            if(isEmpty()) return;
            for (int i = front; i != rear; i=(i+1)%size) {
                System.out.print(queue[i]+" ");
            }
            System.out.println(queue[rear]);
        }
        
    }
    public static void main(String[] args) {
        CQueue q = new CQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.print();
        q.remove();
        q.print();
        q.remove();
        q.print();
    }
}
