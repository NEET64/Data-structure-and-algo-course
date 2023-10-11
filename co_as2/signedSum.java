package co_as2;

public class signedSum {

    public static int[] toBit(int n){
        int ar[] = new int[5];
        int ptr = 4;
        if(n<0){
            n = (int)Math.abs(n+1);
            return negate(toBit(n));
        }else{
            while(n>0){
                int r = n%2;
                ar[ptr] = r;
                ptr--;
                if(ptr<0) break;
                n = n/2;
            }
            return ar;
        }
    }

    public static int[] negate(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] == 1){
                ar[i] = 0;
            }else ar[i] = 1;
        }
        return ar;
    }

    public static void show(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
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

    public static void add(int a, int b){
        int a1[] = toBit(a);
        int a2[] = toBit(b);
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
        System.out.print(a +"  ==>  ");
        show(a1);
        System.out.println();
        System.out.print(b +"  ==>  ");
        show(a2);
        System.out.print("\nsum   ==>  ");
        show(sum);
        System.out.print("  ==>  "+toInt(sum));
    }

    public static void main(String[] args) {
        add(-12, -10);
        System.out.println();
        show(toBit(-10));
    }
}
