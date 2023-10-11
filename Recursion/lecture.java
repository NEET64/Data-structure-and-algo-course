package Recursion;

public class lecture {
    
    public static void decreasing(int n){
        if(n < 0){
            return;        
        }else{
            System.out.print(n+" ");
            decreasing(n-1);
        }
    }

    public static void increasing(int n){
        if(n < 0){
            return;        
        }else{
            increasing(n-1);
            System.out.print(n+" ");
        }
    }

    public static int fact(int n){
        if(n <= 0){
            return 1;
        }
        return n * fact(n-1);
    }

    public static int nNatural(int n){
        if(n == 1){
            return 1;
        }
        return n + nNatural(n-1);
    }

    public static long nFib(int n){
        // if(n == 1){
        //     return 1;
        // }else if(n == 0){
        //     return 0;
        // }
        if(n == 1 || n == 0){
            return n;
        }
        return nFib(n-1) + nFib(n-2);
    }
    
    public static boolean isSorted(int n[],int i){
        if(n.length-1 == i){
            return true;
        }
        if(n[i]>n[i+1]){
            return false;
        }
        return isSorted(n, i+1);
    }

    public static int firstOcc(int a[],int i,int key){
        if(i >= a.length){
            return -1;
        }
        if(a[i] == key){
            return i;
        }
        return firstOcc(a, i+1, key);
    }

    public static int lastOcc(int a[],int i,int key){
        if(i >= a.length){
            return -1;
        }
        
        if(lastOcc(a, i+1, key) == -1 && a[i] == key){
            return i;
        }
        return lastOcc(a, i+1, key);
    }

    public static int xPowN(int x,int n){
        if(n == 0){
            return  1;
        }
        return x * xPowN(x, n-1);
    }

    public static int tilingProblem(int n){// 2xn size of area
        if(n == 0 || n == 1){
            return 1;
        }
        // if chose vertical
        int forVertical = tilingProblem(n-1);

        //if chose horizontal
        int forHorizontal = tilingProblem(n-2);


        return forHorizontal + forVertical;
    }

    public static StringBuilder removeDup(String s,boolean ar[],int i,StringBuilder sb){
        if(s.length() == i){
            return sb;
        }

        if(!ar[s.charAt(i) - 'a']){
            sb.append(s.charAt(i));
            ar[s.charAt(i)-'a'] = true;
        }
        return removeDup(s, ar, i+1, sb);
    }

    public static int friendPair(int n){
        if(n == 1 || n == 2){
            return n;
        }
        return friendPair(n-1)+friendPair(n-2)*(n-1);
    }

    public static void binString(int n,int p,String s) {
        if(n == 0){
            System.out.println(s);
            return;
        }
        binString(n-1, 0,s+"0");
        if(p == 0){
            binString(n-1, 1, s+"1");
        }
    }

    public static void main(String[] args) {
        // decreasing(10);
        // System.out.println();

        // increasing(10);
        // System.out.println();
        
        // System.out.println("the factorial of 5 is: "+fact(5));
        
        // System.out.println("the sum of first 5 no.: "+nNatural(10));

        // System.out.println("the 6th fibonacci no.: "+nFib(10));

        // int ar[] = {1,4,2,3,4,6,4};
        // System.out.println(isSorted(ar, 0));

        // System.out.println(lastOcc(ar, 0, 4));

        // System.out.println("2 power 4 == "+xPowN(2, 6));

        // System.out.println(tilingProblem(4));

        // boolean ar[] = new boolean[26];
        // System.out.println(removeDup("neetdhameliya", ar, 0, new StringBuilder("")));
    
        // System.out.println(friendPair(3));

        // binString(5,0,"");

        System.out.println(nFib(3));

    }
}
