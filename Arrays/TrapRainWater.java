package Arrays;

public class TrapRainWater {
    public static int findLeft(int ar[], int index) {
        int maxIndex = index;
        for (int i = index; i >= 0; i--) {
            if(ar[maxIndex] < ar[i]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int findRight(int ar[], int index) {
        int maxIndex = index;
        for (int i = index; i < ar.length; i++) {
            if(ar[maxIndex] < ar[i]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        int ar[] = {5,4,3,2,1};
        int volume = 0;
        int waterLevel = 0;

        int left[] = new int[ar.length];
        int right[] = new int[ar.length];

        for (int i = 0; i < left.length; i++) {
            left[i] = ar[findLeft(ar, i)];
            right[i] = ar[findRight(ar, i)];
        }

        for (int i = 0; i < ar.length; i++) {
            waterLevel = Math.min(left[i], right[i]);
            volume += waterLevel - ar[i];
        }

        // for (int i = 0; i < ar.length-1; i++) {
        //     do {
        //         i++;
        //     } while (ar[start] > ar[i] && i < ar.length-1);
        //     if(i-start >= 2){
        //         waterLevel = Math.min(ar[start], ar[i]);
        //     }
        //     for (int j = start+1; j < i; j++) {
        //         volume += waterLevel - ar[j];
        //     }
        //     start = i;
        // }

        System.out.println("The volume of the water is : "+volume);
    }
}
