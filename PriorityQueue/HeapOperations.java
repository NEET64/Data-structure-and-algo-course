package PriorityQueue;

import java.util.ArrayList;

public class HeapOperations {
    static class Heap{
        ArrayList<Integer> list = new ArrayList<>();

        public void add(int data) {
            list.add(data);
            int x = list.size()-1;
            int par = (x-1)/2;
            
            while(list.get(x) < list.get(par)){
                int temp = list.get(x);
                list.set(x, list.get(par));
                list.set(par, temp);
                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return list.get(0);
        }

        public void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;

            int minIdx = i;
            if(left < list.size()-1 && list.get(minIdx) > list.get(left)){
                minIdx = left;
            }
            if(right < list.size()-1 && list.get(minIdx) > list.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                int temp = list.get(i);
                list.set(i, list.get(minIdx));
                list.set(minIdx, temp);

                heapify(minIdx);
            }
        }
        public int remove(){
            int data = list.get(0);

            list.set(0, list.get(list.size()-1));
            list.remove(list.size()-1);

            heapify(0);
            return data;
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.add(6);
        heap.add(3);
        heap.add(4);
        heap.add(5);
        heap.add(10);

        heap.remove();
        System.out.println(heap.list);
    }
}
