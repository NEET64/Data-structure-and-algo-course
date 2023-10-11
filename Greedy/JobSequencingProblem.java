import java.util.Arrays;

public class JobSequencingProblem {
    static class Job {
        int id, profit, deadline;
        Job(int x, int y, int z){
            this.id = x;
            this.deadline = y;
            this.profit = z; 
        }
    }
    public static void main(String[] args) {
        Job ar[] = {
            new Job(1, 4, 20),
            new Job(2, 1, 10),
            new Job(3 , 1, 40),
            new Job(4, 1, 30)
        };

        Arrays.sort(ar, (a,b) -> b.profit-a.profit);

        boolean slot[] = new boolean[ar.length];

        int count=0;
        int profit=0;

        for (int i = 0; i < slot.length; i++) {
            for (int j = Math.min(slot.length-1, ar[i].deadline-1); j >= 0; j--) { // we did math.min() because we can't go beyoung our slots length
                if(!slot[j]){
                    slot[j] = true;
                    profit+=ar[i].profit;
                    count++;
                    break;
                }
            }
        }

        System.out.println("number of process: "+count);
        System.out.println("total profit: "+profit);
    }
}


// https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1