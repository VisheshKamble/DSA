package Strings;
//leetcode 17. Letter Combinations of a Phone Number
public class LetterCombination {
    public static void main(String[] args){
        
        String up = "12";
        letterCombination("" , up);

    }

    static void letterCombination(String  p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit  = up.charAt(0) - '0' ;

        for (int i = (digit - 1) * 3 ; i < digit * 3 ; i++){
            char ch = (char)('a' + i);
            letterCombination(p + ch, up.substring(1));
        } 

    }
    
}
