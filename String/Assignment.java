package String;

public class Assignment {
    public static int question1(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        //question1
        // System.out.println(question1("this is a string now count"));

        //question2
        // String str = "ShradhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));

        //question3
        // String str = "ApnaCollege".replace("l","");
        // System.out.println(str);
    
        //question4
        // String str1 = "cdba";
        // String str2 = "abcd";
        // char ar1[] = new char[str1.length()];
        // char ar2[] = new char[str2.length()];
        // for (int i = 0; i < str1.length(); i++) {
        //     ar1[i] = str1.charAt(i);
        //     ar2[i] = str2.charAt(i);
        // }
        // Arrays.sort(ar1);
        // Arrays.sort(ar2);
        // for (int i = 0; i < ar1.length; i++) {
        //     if (ar1[i] != ar2[i]) {
        //         System.out.println("not an anagram");
        //         return;
        //     }
        // }
        // System.out.println("yes it is an anagram!");
    }    
}
