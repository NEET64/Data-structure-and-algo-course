package Recursion;          

public class Question5 {
    public static void tower(int n, char start, char b, char destination){
        if(n == 1){
            System.out.println("transfer "+n+" from "+start+" to "+destination);
            return;
        }
        tower(n-1, start, destination, b);
        System.out.println("transfer "+n+" from "+start+" to "+destination);
        tower(n-1, b, start, destination);
    }

    static int countSteps(int n, char start, char b, char destination){
        if(n == 1){
            return 1;
        }
        return countSteps(n-1, start, destination, b) + countSteps(n-1, b, start, destination) +1;
    }

    public static void main(String[] args) {
        int n = 4;
        tower(n,'A','B','C');
        System.out.println("the number of steps taken: "+countSteps(n, 'A', 'B', 'C'));
    }
}
