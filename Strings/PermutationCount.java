package Strings;

public class PermutationCount {
    public static void main(String[] args){
        int count = permutationCount("" , "abc");
        System.out.println(count);

    }

    static int permutationCount(String p , String up  ){
        if(up.isEmpty()){
            return 1 ;
        }

        char ch = up.charAt(0);
            int count = 0 ;

            for (int i = 0 ; i <= p.length() ; i++){
                String first = p.substring(0 , i);
                String second = p.substring(i , p.length());
                count += permutationCount(first + ch + second , up.substring(1));
            }
            return count;
    }
}
