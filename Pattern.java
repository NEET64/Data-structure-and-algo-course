public class Pattern {
    
    public static void hollowRectangle(int a, int b) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if(i==1 || i==a || j==1 || j==b){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedAndRotatedHalfPiramid(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPiramidWithNum(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floydTriangle(int a) {
        int count = 1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void triangle0_1(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if(((i+j)<a+1 && i < j) || ((i+j)>a+1) && i > j){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void butterflyHardWay(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= a-i; j++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= a-i; j++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= a; j++) {
                if (i==1 || j==1 || i==a || j==a) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    public static void diamond(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void palindromePiramid(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i-j+1+" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void numberPiramid(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRectangle(5, 10);

        invertedAndRotatedHalfPiramid(5);

        invertedHalfPiramidWithNum(5);

        floydTriangle(4);

        triangle0_1(5);

        butterfly(5);

        butterflyHardWay(5);

        solidRhombus(5);

        hollowRhombus(5);
        
        diamond(5);

        palindromePiramid(5);

        numberPiramid(5);
    }    
}