package Strings.Recursion;

public class Stream {
    public static void main(String[] args){
        skip ("" , "baccad");

    }
//passing in the argument
    static void skip (String processed , String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return ;
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'a'){
            skip(processed , unprocessed.substring(1));
        } else {
            skip(processed + ch , unprocessed.substring(1));
        }
    }
}
