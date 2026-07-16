package Strings;

import java.util.ArrayList;



public class Permutation1 {
    public static void main(String[] args){
        String str = "abc";
        System.out.println(permutationList("" , str));

    }

    static ArrayList<String> permutationList (String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0 ; i <= p.length() ; i++){
            String first = p.substring(0 , i);
            String second = p.substring(i , p.length());
            ans.addAll(permutationList(first + ch + second , up.substring(1)));

        }
        return ans;
    }
}
