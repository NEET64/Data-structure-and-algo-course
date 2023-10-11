package Loops;

import java.util.Scanner;

// Question 2: Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        int num, evenSum=0, oddSum=0;
        
        while(choice == 1){
            System.out.print("enter the number: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
            System.out.print("if you want to continue enter 1 else 0: s");
            choice = sc.nextInt();
        }

        System.out.println("the even sum is: "+evenSum);
        System.out.println("the odd sum is "+oddSum);

        System.out.println(sc); //ye yello color na aye na isiliye
    }
}
