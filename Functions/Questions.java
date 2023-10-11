package Functions;

public class Questions {
    //to cal average of three numbers
    public static void avgThree(int a, int b, int c) {
        System.out.println((a+b+c)/3);
    }

    //To check if the number is even
    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //To check if the number is palindrom 
    public static boolean isPalindrome(int a) {
        int num = a, rev = 0, last;
        while(a != 0){
            last = a%10;
            rev = rev*10 + last;
            a /= 10;
        }
        if (num == rev) {
            return true;
        } else {
            return false;
        }
    }

    //To cal the sum of the digits in an int
    public static int sumOfDigit(int a) {
        int sum = 0, last; 
        while (a != 0) {
            last = a%10;
            sum += last;
            a /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }
}
