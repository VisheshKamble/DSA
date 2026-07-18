package Strings;
import java.util.ArrayList;
public class LetterCombinationRet {
    public static void main(String[] args){
        System.out.println(letterCombination("" , "12"));

    }

    static ArrayList<String> letterCombination(String p  , String up ){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit  = up.charAt(0) - '0' ;
        ArrayList<String> ans = new ArrayList<>();
        for (int  i = (digit - 1) * 3 ; i < digit * 3 ; i++){
            char ch = (char) ('a' + i);
            ans.addAll(letterCombination(p + ch , up.substring(1)));
        }
        return ans;
    } 
}
