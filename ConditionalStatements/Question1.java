package ConditionalStatements;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("the number is positive");
        }
        else if (a < 0){
            System.out.println("the number is negative");
        }
        else{
            System.out.println("the number is zero");
        }

        
        System.out.println(sc); //ye yello color na aye na isiliye
    }
}
