package Arrays;

public class lecture {
    public static int linerSearch(int ar[], int key){
        for (int i = 0; i < ar.length; i++) {
            if (key == ar[i]) {
                return i;
            } 
        }
        return -1;
    }

    public static int binarySearch(int ar[],int key){
        int l = 0;
        int r = ar.length - 1;
        while (l <= r) {
            int mid = (l+r)/2;
            if (key == ar[mid]) {
                return mid;
            }
            if (key > ar[mid]) {
                l = mid + 1;
            } else {
                r = mid -1;
            }
        }
        return -1;
    }

    public static void reverseArray(int ar[]) {
        for (int i = 0; i < ar.length/2; i++) {
            int t = ar[i];
            ar[i] = ar[ar.length-i-1];
            ar[ar.length-i-1] = t;
        }
        printArray(ar);
    }

    public static void printPairs(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                System.out.print(ar[i]+",");
                System.out.print(ar[j]+"  ");
            }
            System.out.println();
        }
    }

    public static void printSubArray(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(ar[k]+" ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void HWprintSubArray(int ar[]){
        int sum[] = new int[15];
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                sum[count] = 0;
                for (int k = i; k <= j; k++) {
                    sum[count] += ar[k];
                }
                System.out.print(sum[count]+" ");
                count++;
            }
            System.out.println();
        }
        System.out.println("greates "+ getLargest(sum));
        System.out.println("lowest "+ getLowest(sum));
    }

    public static void maxSubArraySum(int ar[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += ar[k];
                }
                if(max < sum){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }

    public static void prefixSum(int ar[]) {
        int prefix[] = new int[ar.length];
        prefix[0] = ar[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < ar.length; i++) {
            prefix[i] += ar[i];
        }
        for (int i = 0; i < prefix.length; i++) {
            for (int j = i; j < prefix.length; j++) {
                int n = i==0 ? prefix[i] : prefix[i] - prefix[j-1];
                if(max < n){
                    max = n;
                }
            }
        }
        System.out.println(max);
    }

    public static void kadaneAlgo(int ar[]) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
            if (sum < 0){
                sum = 0;
            }
            if(max < sum){
                max = sum;
            }
        }
        if(sum <= 0 && max ==0){
            System.out.println(getLargest(ar));
        } else{
            System.out.println(max);
        }
    }

    public static int getLargest(int ar[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if(max < ar[i]){
                max = ar[i];
            }
        }
        return max;
    }

    public static int getLowest(int ar[]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if(min > ar[i]){
                min = ar[i];
            }
        }
        return min;
    }

    public static void printArray(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        int ar[] = {1,1,-2};

        kadaneAlgo(ar);
        // maxSubArraySum(ar);

        // prefixSum(arr);

        // maxSubArraySum(arr);
        
        // HWprintSubArray(arr);

        // printPairs(arr);

        // reverseArray(arr);

        // int key = 6;
        // int index = binarySearch(arr, key);
        // if (index == -1){
        //     System.out.println("Element was not found in the array:(");
        // }
        // else{
        //     System.out.println("Element found at "+index);
        // }

        // System.out.println(getLargest(arr));

        // int key = 20;
        // int index = linerSearch(arr, key);
        // if (index == -1){
        //     System.out.println("Element was not found in the array:(");
        // }
        // else{
        //     System.out.println("Element found at "+index);
        // }
    }
}
