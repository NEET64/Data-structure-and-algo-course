package Loops;

import java.util.Scanner;

// Question 3: Write a program to find the factorialof any number entered by the user.
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;

        if (num == 0 || num == 1) {
            System.out.println("the factorial of the "+num+" is 1");
        } else {
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("the factorial of the "+num+" is "+factorial);

            System.out.println(sc); //ye yello color na aye na isiliye
        }
    }
}
