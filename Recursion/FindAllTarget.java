package Recursion;
import java.util.ArrayList;

public class FindAllTarget {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,4,4,5} ;
        find(arr , 4 , 0);
        System.out.println(list);

    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void find (int[] arr , int target , int index){
        if(index == arr.length){
            return ;
        }

        if(arr[index] == target ){
            list.add(index);
        }
        find(arr , target , index + 1);
    }


}
