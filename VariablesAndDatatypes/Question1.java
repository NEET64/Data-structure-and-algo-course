package VariablesAndDatatypes;

import java.util.Scanner;

// Question1 : In a program, input 3 numbers: A , B and C.
// You have to output the average of these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)

public class Question1 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        float avg = (a+b+c)/3;

        System.out.println("The Average of the Three numbers is: "+avg);

        System.out.println(s); //ye yello color na aye na isiliye
    }
}