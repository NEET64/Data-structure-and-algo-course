package cn_as2;

public class lrc {
    public static String charToBit(int n) {
        StringBuilder ans = new StringBuilder("");

        while(n>0){
            int rem = n%2;
            ans.insert(0,rem);
            n/=2;
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "Neet";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }System.out.println(" LRC");

        String ans[] = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ans[i] = charToBit(str.charAt(i));
        }

        String lrc = "";
        for (int i = 0; i < 7; i++) {
            int parity = 0;
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[j].charAt(i)+" ");
                if(ans[j].charAt(i) == '1'){
                    parity++;
                }
            }
            System.out.print(" "+parity%2);
            lrc += parity%2;
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < lrc.length(); i++) {
            if(lrc.charAt(i) == '1'){
                sum += (int)Math.pow(2, lrc.length()-i-1);
            }
        }

        System.out.println();
        System.out.println(lrc +" = "+sum);
        System.out.println("LRC for '"+str+"' is '"+(char)sum+"'");
    }
}
