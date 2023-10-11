package Arrays;

public class Assignment {
    public static boolean Question1(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printAr(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }

    // public static int Question2(int nums[], int target) {
    //     int min = minSearch(nums); 
    //     //find in sorted left 
    //     if(nums[min] <= target && target <= nums[nums.length-1]){ 
    //         return search(nums,min,nums.length-1,target); 
    //     } 
    //     //find in sorted right 
    //     else{
    //          return search(nums,0,min,target); 
    //         } 
    //     }//binary search to find target in left to right boundary 
    //     public static int search(int[] nums,int left,int right,int target){
    //         int l = left; 
    //         int r  = right;
    //         // System.out.println(left+" "+right); 
    //         while(l <= r){
    //             int mid = l + (r - l)/2; 
    //             if(nums[mid] ==   target){
    //                 return mid; 
    //             } 
    //             else if(nums[mid] > target){
    //                 r = mid-1; 
    //             } 
    //             else{
    //                 l = mid+1; 
    //             } 
    //         } 
    //         return -1; 
    //     }
    //     //smallest element index
    //     public static int minSearch(int[] nums){ 
    //         int left = 0; 
    //         int right = nums.length-1; 
    //         while(left < right){
    //             int mid = left + (right - left)/2; 
    //             if(mid >  0  &&   nums[mid-1]    >  nums[mid]){
    //                 return mid; 
    //             } 
    //             else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){ 
    //                 left = mid+1; 
    //             } 
    //             else{
    //                 right = mid-1; 
    //             } 
    //         } 
    //         return left; 
    //     }

    public static int Question3(int ar[]){
        int maxProfit = 0;
        int buyDay = 0, sellDay, profit=0;
        
        for (int i = 1; i < ar.length; i++) {
            if(ar[buyDay] > ar[i]){
                buyDay = i;
            }
            sellDay = i;
            profit = ar[sellDay] - ar[buyDay];
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit == 0 ? 0 : maxProfit;
    }

    public static int leftMax(int ar[], int index){
        int max = Integer.MIN_VALUE;
        for (int i = index; i >= 0; i--) {
            max = Math.max(ar[i], max);
        }
        return max;
    }
    public static int rightMax(int ar[], int index){
        int max = Integer.MIN_VALUE;
        for (int i = index; i < ar.length; i++) {
            max = Math.max(ar[i], max);
        }
        return max;
    }

    public static int Question4(int ar[]){
        int volume = 0;

        for (int i = 0; i < ar.length; i++) {
            int waterLevel = Math.min(leftMax(ar, i), rightMax(ar, i));
            volume += waterLevel - ar[i];
        }

        return volume;
    }

    public static void triplet(int ar[]){
        for (int i = 0; i < ar.length-2; i++) {
            for (int j = i+1; j < ar.length-1; j++) {
                for (int k = j+1; k < ar.length; k++) {
                    if ((ar[i]+ar[j]+ar[k]) == 0) {
                        System.out.print(ar[i]+" "+ar[j]+" "+ar[k]+"   ");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int ar[] = {-1,0,1,2,-1,4};
        triplet(ar);
        // Que4
        // int height[] = {4,2,0,3,2,5};
        // System.out.println(Question4(height));

        // Que3
        // int ar[] = {7,6,4,3,1};
        // System.out.println(Question3(ar));

        //Que2
        // int ar[] = {4,5,6,7,0,1,2};
        // int target = 3;
        // printAr(ar);
        // System.out.println();
        // System.out.println(Question2(ar, target));
        
        //Que1
        // int nums[] = {1,1,1,3,3,4,3,2,4,2};
        // System.out.println(Question1(nums));
    }
}
