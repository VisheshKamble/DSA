package Recursion;

public class LinearWithRecursion {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5 ;
        System.out.println(linearSearch(arr, target , 0));

    }

    static boolean linearSearch (int[] arr , int target , int index){
        if( index == arr.length){
            return false ;
        }

        return arr[index] == target || linearSearch(arr , target , index + 1);
    }
    
}
