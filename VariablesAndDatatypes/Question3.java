package VariablesAndDatatypes;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        float pencil = 1.5f;
        float pen = 5f;
        float eraser = 2f;

        System.out.print("Enter number of pencil: ");
        int pencil_num = sc.nextInt();
        System.out.print("Enter number of pen: ");
        int pen_num = sc.nextInt();
        System.out.print("Enter number of eraser: ");
        int eraser_num = sc.nextInt();

        float cost = (pencil * pencil_num)+(pen * pen_num)+(eraser * eraser_num);
        float cost_With_GST = cost + (cost * 0.18f);  

        System.out.println("Your Total bill is: "+cost_With_GST);

        
        System.out.println(sc); //ye yello color na aye na isiliye
    }
}
