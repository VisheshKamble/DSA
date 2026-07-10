package Recursion;
import java.util.ArrayList;

public class FindAllTarget {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,4,4,5} ;
        find(arr , 4 , 0);
        System.out.println(list);
    }


    //using static variable 
    
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

    //using return type

    static ArrayList<Integer> findAllIndex (int[] arr , int target , int index , ArrayList<Integer> list){
        if(index == arr.length){
            return list ;
        }

        if(arr[index] == target ){
            list.add(index);
        }
        return findAllIndex(arr , target , index + 1 , list);
    }


}
