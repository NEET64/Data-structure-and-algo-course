package PriorityQueue;

import java.util.PriorityQueue;

public class MinTimeToFillSlots {
    public static void main(String[] args) {
        int ar[] = {2,6};
        int size = 6;
        int count=-1;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        boolean visited[] = new boolean[size+1];

        for(int i : ar){
            q.add(i);
            visited[i] = true;
        }

        while(!q.isEmpty()){
            int s = q.size();

            for (int i = 0; i < s; i++) {
                int cur = q.poll();

                if(cur - 1 > 0 && !visited[cur-1]){
                    q.add(cur-1);
                    visited[cur-1] = true;
                }
                if(cur + 1 < size && !visited[cur+1]){
                    q.add(cur+1);
                    visited[cur+1] = true;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
