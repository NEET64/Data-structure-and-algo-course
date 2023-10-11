package co_as2;

public class unsignSum {

    public static int[] toBit(int n){
        int ar[] = new int[8];
        int ptr = 7;
        while(n>0){
            int r = n%2;
            ar[ptr] = r;
            ptr--;
            if(ptr<0) break;
            n = n/2;
        }
        return ar;
    }

    public static int toInt(int n[]){
        int ptr = 0;
        int sum = 0;
        for (int i = 7; i >= 0; i--) {
            if(n[i] == 1){
                sum = sum + (int)Math.pow(2, ptr);
            }
            ptr++;
        }
        return sum;
    }
    public static void add(int a, int b){
        int a1[] = toBit(a);
        int a2[] = toBit(b);
        int sum[] = new int[8];
        int carry = 0;
        for (int i = 7; i >= 0; i--) {
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
        System.out.println("\nthe sum is:");
        System.out.print(toInt(sum)+"  ==>  ");
        show(sum);
    }

    public static void show(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of a: ");
        // int a = sc.nextInt();
        // System.out.print("Enter the value of b: ");
        // int b = sc.nextInt();

        add(10, 12);
    }
}