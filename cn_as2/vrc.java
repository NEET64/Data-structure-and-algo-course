package cn_as2;

public class vrc {
    public static String charToBit(int n){
        StringBuilder ans = new StringBuilder("");
        int parity =0;
        while(n>0){
            int rem = n%2;
            ans.insert(0, rem);
            if(rem == 1){
                parity++;
            }
            n/=2;
        }
        ans.append(parity%2);
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "Neet";

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+"         ");
        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(charToBit(str.charAt(i))+"  ");
        }
    }
}