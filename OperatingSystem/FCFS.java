package OperatingSystem;

public class FCFS {
    static int process = 0;
    static int at = 1;
    static int bt = 2;
    static int ct = 3;
    static int tat = 4;
    static int wt = 5;
    static int rt = 6;
    static int first = 7;

    public static void sort(int ar[][], int k){
        for (int i = 0; i < ar.length; i++) {
            int index = i;
            for (int j = i+1; j < ar.length; j++) {
                if(ar[j][k] < ar[index][k]){
                    index = j;
                }
            }
            int t[] = ar[i];
            ar[i] = ar[index];
            ar[index] = t;
        }
    }

    public static void printTable(int ar[][], float stat, float swt, float srt, int sbt){
        int totaltime =ar[ar.length-1][ct];
        System.out.println("the average turn around time ==> "+(float)stat/ar.length);
        System.out.println("the average waiting time     ==> "+(float)swt/ar.length);
        System.out.println("the average response time    ==> "+srt/ar.length);
        System.out.println("the cpu utilization is       ==> "+(100-(float)(totaltime-sbt)/totaltime*100));
        sort(ar, at);
        int minAT = ar[0][at];
        System.out.println("the throughput here is       ==> "+(float)ar.length/(totaltime-minAT)+"\n");
        sort(ar, process);
        System.out.println("Pno     AT      BT      CT      TAT     WT      RT      First");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j]+"\t");   
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int ar[][] = {{1,0,2,0,0,0,0,0},{2,4,5,0,0,0,0,0},{3,8,3,0,0,0,0,0},{4,6,3,0,0,0,0,0},{5,17,6,0,0,0,0,0}};
        
        sort(ar, at);
        int sumWT = 0;
        int sumTAT = 0;
        int sumRT = 0;
        int sumBT = 0;
        int currTime=0;
        for (int i = 0; i < ar.length; currTime++) {
            if(ar[i][at] <= currTime && ar[i][ct] == 0){
                ar[i][ct] = currTime + ar[i][bt];
                
                ar[i][tat] = ar[i][ct] - ar[i][at];
                ar[i][wt] = ar[i][tat] - ar[i][bt];
                ar[i][first] = currTime;
                ar[i][rt] = ar[i][first] - ar[i][at];   

                sumWT += ar[i][wt];
                sumTAT += ar[i][tat];
                sumRT += ar[i][rt];
                sumBT += ar[i][bt];

                currTime = ar[i][ct]-1;      // -1 is so imp because loop me plus kar raha ha
                i++;
            }
        }

        printTable(ar, sumTAT, sumWT, sumRT, sumBT);
    }
}
