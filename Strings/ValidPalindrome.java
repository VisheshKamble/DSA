package Strings;

//leetcode 125. Valid Palindrome

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man , a plan, a canal: Panama"; 
        System.out.println(isPalindrome(s));
}     

    static boolean isPalindrome(String s){
        int start  = 0;
        int end  = s.length() - 1;
        if(s.length() == 0){
            return true;
        }

        while (start < end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }else if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }else if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }



}