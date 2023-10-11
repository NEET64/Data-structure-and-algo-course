package co_as2;

public class signedSum2 {
    public static int[] toBit(int n) {
        if(n<0){
            return add(toBit(1), negate(toBit(Math.abs(n))));
        }
        int ar[] = new int[5];
        int ptr = 4;
        while(ptr > -1){
            int r = n%2;
            ar[ptr] = r;
            ptr--;
            n = n/2;
        }
        return ar;
    }

    public static int[] add(int a1[], int a2[]){
        int sum[] = new int[5];
        int carry = 0;
        for (int i = 4; i >= 0; i--) {
            int n = a1[i] + a2[i] + carry; 
            if(n >= 2){
                sum[i] = n%2;
                carry = 1;
            }else{
                sum[i] = n;
                carry = 0;
            }
        }
        return sum;
    }

    public static int[] negate(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] == 1){
                ar[i] = 0;
            }else ar[i] = 1;
        }
        return ar;
    }

    public static int toInt(int n[]){
        if(n[0] == 1){
            return -(toInt(negate(n))+1);
        }else{
            int ptr = 0;
            int sum = 0;
            for (int i = 4; i >= 0; i--) {
                if(n[i] == 1){
                    sum = sum + (int)Math.pow(2, ptr);
                }
                ptr++;
            }
            return sum;
        }   
    }

    public static void show(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // System.out.print("Enter the number 1: ");
        int n1 = 10;
        // System.out.print("Enter the number 2: ");
        int n2 = -12;

        show(toBit(n1));
        show(toBit(n2));
        int ar[] = add(toBit(n1),toBit(n2));
        show(ar);
        System.out.println("sum is: "+toInt(ar));
    }
}
