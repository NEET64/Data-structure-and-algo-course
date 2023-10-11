package Functions;

//isPrime, primeInRange, factorial, binomialCoefficient, binToDeci, deciToBin
public class Lecture {

    //func to cal factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    //func to cal binomial coefficient
    public static double binomialCoefficient(int n, int r){
        double result = (factorial(n)) / ((factorial(r))*(factorial(n-r)));
        return result;
    }

    //func to check if the number is prime
    public static boolean isPrime(int a){
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a%i == 0) {
                return false;
            }
        }
        return true;
    }

    //func to print prime numbers from 2 to n
    public static void primesInRange(int a){
        for (int i = 2; i <= a; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    //func to convert binary number to decimal
    public static void binToDeci(int a){
        int last, count=0, deci=0;
        while (a != 0) {
            last = a % 10;
            deci += last * Math.pow(2, count);
            count++;
            a /= 10;
        }
        System.out.println(deci);
    }

    //func to convert decimal number to binary
    public static void deciToBin(int a) {
        int bin=0, count=0;
        while(a != 0){
            bin += a%2 * Math.pow(10, count);
            a /= 2;
            count++;
        }
        System.out.println(bin);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int num = sc.nextInt();
    }
}