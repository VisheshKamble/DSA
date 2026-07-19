package Strings;
import java.util.ArrayList;
public class DiceRet {
    public static void main(String[] args){
        int target  = 4 ;
        System.out.println(dice("" , target));

    }

    static ArrayList<String> dice(String p , int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1 ; i <= 6 && i <= target ; i++){
            ans.addAll(dice(p + i , target - i));
        }
        return ans;
    }
    
    
}
