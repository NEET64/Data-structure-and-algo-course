package OperatingSystem;

public class SJF {
    static int pn = 0;
    static int at = 1;
    static int bt = 2;
    static int ct = 3;
    static int tat = 4;
    static int wt = 5;
    static int rt = 6;
    static int first = 7;

    public static void printTable(int ar[][], int stat, int swt, int srt, int sbt, int totaltime){
        System.out.println("\nthe average turn around time ==> "+(float)stat/ar.length);
        System.out.println("the average waiting time     ==> "+(float)swt/ar.length);
        System.out.println("the average response time    ==> "+(float)srt/ar.length);
        System.out.println("the cpu utilization is       ==> "+(100-(float)(totaltime-sbt)/totaltime*100));
        System.out.println("the throughput here is       ==> "+(float)ar.length/(totaltime)+"\n");
        System.out.println("\nPno     AT      BT      CT      TAT     WT      RT      First");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j]+"\t");   
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int ar[][] = {{1,0,25,0,0,0,0,0},{2,1,6,0,0,0,0,0},{3,3,3,0,0,0,0,0},{4,5,1,0,0,0,0,0},{5,7,5,0,0,0,0,0},{6,10,4,0,0,0,0,0}};
    
        boolean check[] = new boolean[ar.length];  //check[0][i] if true then added in the gantt chart

        int sumtat=0, sumwt=0, sumrt=0, sumbt=0;

        int processDone = 0;
        int time = 0;
        while(processDone != ar.length){
            
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < check.length; i++) {
                if(ar[i][at] <= time && !check[i]){
                    if(ar[i][bt] <= min){
                        minIndex = i;
                        min = ar[i][bt];
                    }
                }
            }


            if(minIndex != -1){
                System.out.print("p"+ar[minIndex][pn]+" ");
                ar[minIndex][first] = time;

                time += ar[minIndex][bt];
                ar[minIndex][ct] = time;

                ar[minIndex][tat] = ar[minIndex][ct] - ar[minIndex][at];
                ar[minIndex][wt] = ar[minIndex][tat] - ar[minIndex][bt];
                ar[minIndex][rt] = ar[minIndex][first] - ar[minIndex][at];

                sumtat += ar[minIndex][tat];
                sumwt += ar[minIndex][wt];
                sumrt += ar[minIndex][rt];
                sumbt += ar[minIndex][bt];

                processDone++;
                check[minIndex] = true;
            }else time++;
        }
        printTable(ar, sumtat, sumwt, sumrt, sumbt, time);
    }
    
}
