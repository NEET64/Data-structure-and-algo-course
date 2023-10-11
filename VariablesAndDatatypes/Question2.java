package VariablesAndDatatypes;

import java.util.Scanner;

// Question2: In a program, input the side of a square.
// You have to output the area of the square.
// (Hint : area of a square is (side x side))

public class Question2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float side = s.nextFloat();

        float area = side * side;
        System.out.println(area);

        
        System.out.println(s); //ye yello color na aye na isiliye
    }
}
