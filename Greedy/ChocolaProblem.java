import java.util.Arrays;

public class ChocolaProblem {
    public static int minimumCostOfBreaking(int[] X, int[] Y,int M,int N) {
        // code here
        Arrays.sort(X);
        Arrays.sort(Y);
        int i = M-1;
        int j = N-1;
        int hC=1;
        int vC=1;
        
        int cost=0;
        while(i>=0 && j>=0){
            if(X[i]>Y[j]){
                cost += X[i]*vC;
                hC++;
                i--;
            }else{
                cost += Y[j]*hC;
                vC++;
                j--;
            }
        }
        while(i>=0){
            cost += X[i]*vC;
            hC++;
            i--;
        }
        while(j>=0){
            cost += Y[j]*hC;
            vC++;
            j--;
        }
        return cost;
    }
    public static void main(String[] args) {
        int X[] = {2, 1, 3, 1, 4};
        int Y[] = {4, 1, 2};
        
        System.out.println(minimumCostOfBreaking(X, Y, X.length, Y.length));
    }
}
