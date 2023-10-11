package ConditionalStatements;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("The year is a leap year");
                } 
                else {
                    System.out.println("The year is not a leap year");
                }
            } 
            else {
                System.out.println("The year is a leap year");
            }
        }
        else{
            System.out.println("The year is not a leap year");
            
            System.out.println(sc); //ye yello color na aye na isiliye
        }
    }
}
