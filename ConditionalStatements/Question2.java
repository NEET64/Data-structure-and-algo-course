package ConditionalStatements;

public class Question2 {
    public static void main(String[] args) {
        double temp = 103.5;

        String report = (temp > 100) ? "you have a fever" : "you don't have a fever";
        
        System.out.println(report);
    }
}
