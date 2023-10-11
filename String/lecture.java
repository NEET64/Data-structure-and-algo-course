package String;

public class lecture {

    public static void isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("no it is not the palindrome");
                return;
            }
        }
        System.out.println("yes it is a palindrome");
    }

    public static float shortestPath(String str){
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'W'){
                x--;
            }
            else if(str.charAt(i) == 'E'){
                x++;
            }
            else if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
        }
        return (float)Math.sqrt(x*x + y*y);
    }

    public static String largestString(String s[]){
        String max = s[0];
        for (int i = 1; i < s.length; i++) {
            if(s[i].compareToIgnoreCase(max) > 0){
                max = s[i];
            }
        }
        return max;
    }

    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1) == ' '){
                ch = Character.toUpperCase(str.charAt(i));
            }else{
                ch = str.charAt(i);
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i+1) == str.charAt(i)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbcc";
        System.out.println(compress(str));
    }
}
