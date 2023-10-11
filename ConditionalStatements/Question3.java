package ConditionalStatements;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the week number: ");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Monday");
                break;  
            case 2:
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Not a valid input");
                
                System.out.println(sc); //ye yello color na aye na isiliye
                break;
        }
    }
}
