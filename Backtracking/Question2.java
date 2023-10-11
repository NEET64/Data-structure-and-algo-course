package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static void findPer(List<String> list,int k, String str, List<String> ans){
        if(k==list.size()){
            ans.add(str);
            return;
        }
        for(int i=0; i<list.get(k).length(); i++){
            findPer(list, k+1, str+list.get(k).charAt(i), ans);
        }
    }

    public static List<String> letterCombinations(String digits) {
        String keypad[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> keys = new ArrayList<String>();
        for(int i=0; i<digits.length(); i++){
            keys.add(keypad[digits.charAt(i)-50]);
        }
        List<String> ans = new ArrayList<String>();
        if(keys.isEmpty()) return ans;
        findPer(keys, 0, "", ans);
        return ans;
    }
    public static void main(String[] args) {
        List<String> list = letterCombinations("9547");

        System.out.println(list);
    }
}
