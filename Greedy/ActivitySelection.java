import java.util.Arrays;

public class ActivitySelection {

    public static int activitySelection(int start[], int end[])
    {
        // add your code here
        int ar[][] = new int[end.length][3];
        for(int i=0; i<start.length; i++){
            ar[i][0] = i;                       // no practical use here but maybe in some another question 
            ar[i][1] = start[i];
            ar[i][2] = end[i];
        }


        Arrays.sort(ar, (a,b)->a[2]-b[2]);     // sorting accoding to the end 


        int cur = 0;
        int count = 0;
        for(int i=0; i<ar.length; i++){
            if(ar[i][1] > cur){
                cur = ar[i][2];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int start[] = {1, 3, 2, 5};
        int end[] = {2, 4, 3, 6};

        System.out.print(activitySelection(start, end));  
    }
}

//https://practice.geeksforgeeks.org/problems/activity-selection-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
