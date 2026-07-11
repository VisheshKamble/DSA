package Recursion;

import java.util.ArrayList;

public class FindWithoutParameter {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,4} ;
        System.out.println(find(arr, 4 , 0));

    }

    static ArrayList<Integer> find (int[] arr , int target , int index){

        ArrayList<Integer> list = new ArrayList<>() ;  
        
        if (index == arr.length){
            return list ;
        }

        //this will contain answer for that function call only

        if(arr[index] == target){
            list.add(index) ;
        }

        ArrayList<Integer> ansFromBelowCalls = find(arr, target , index + 1) ;

        list.addAll(ansFromBelowCalls) ; //merging the answer from below calls to the current function call

        return list ;
    }
    
}
