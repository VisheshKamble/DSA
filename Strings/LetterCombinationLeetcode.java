package Strings;
import java.util.ArrayList;
import java.util.List;

public class LetterCombinationLeetcode {
    public static void main(String[] args){
        System.out.println(LetterCombination("23"));

    }

    static List<String> LetterCombination(String digits){
        if(digits.isEmpty()){
            return new ArrayList<>();
        }

        String[] map = {
            "",
            "",
            "abc",
            "def",
            "ghi",  
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };

        return helper ("" , digits , map) ;
    }

    static List<String> helper (String p , String up , String[] map){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        String letters = map[digit];
        List<String> ans = new ArrayList<>();
        for(int i = 0 ; i < letters.length() ; i++){
            char ch = letters.charAt(i);
            ans.addAll(helper(p + ch , up.substring(1) , map));

        }
        return ans;
     }
}
