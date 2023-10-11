package BitManipulation;

public class lecture {
    
    public static void oddEven(int a){
        if((a & 1) == 1){
            System.out.println("the number is Odd");
        }
        else{
            System.out.println("the number is Even");
        }
    }

    public static void getIthBit(int n, int i){
        //my solution :-
        // if((n & (int)Math.pow(2, i)) == (int)Math.pow(2, i)){
        //     System.out.println("the ith bit is 1");
        // }else{
        //     System.out.println("the ith bit is 0");
        // }

        if ((n & (1<<i)) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }

    public static int setIthBit(int n, int i){
        // my dumb solution:-
        // if((n | (1<<i)) == 0){
        //     System.out.println("no change to "+n);
        // }
        // else{
        //     n += Math.pow(2, i);
        //     System.out.println("new number is: "+n);
        // }

        return (n | (1<<i));
    }

    public static int clearIthBit(int n, int i){
        return (n & ~(1<<i));
    }

    public static int clearLastIBit(int n, int i){
        n = (n>>i)<<i;
        return n;
    }

    public static int clearInRange(int n, int i, int j){
        // my stupid solution:-
        // int bitMask = ~(~(~0 << (j-i)+1)<<i);
        // return n & bitMask;
        
        //here i is starting position and j is length

        int bitMask = ~((((1 << j)-1))<<i);
        return n & bitMask;
    }

    public static boolean isPowerOf2(int n){
        return ((n & (n-1)) == 0);
    }

    public static int OneInBit(int n){
        int count = 0,i = 0;
        while(n>>i != 0) {
            count+=((n>>i)&1);
            i++;
        }
        return count;
    }

    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) == 1){
                ans *= a;
            }
            a *= a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExpo(2,5));
    }
}
