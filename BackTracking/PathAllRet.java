package BackTracking;
import java.util.ArrayList;

public class PathAllRet {
    public static void main(String[] args){
        int r = 3;
        int c = 3;
        System.out.println(pathAllRet("" , r , c));

    }
    static ArrayList<String> pathAllRet (String p , int r , int c){

        if ( r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 1 && c > 1){
            ans.addAll(pathAllRet(p + 'D' , r - 1 , c -1));

        }

        if (r > 1){
            ans.addAll(pathAllRet(p + 'V' , r - 1 , c));
        }

        if (c > 1){
            ans.addAll(pathAllRet(p + 'H' , r , c - 1));
        }

     return ans ;

    }

}
