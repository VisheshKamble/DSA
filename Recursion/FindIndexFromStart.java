package Recursion;

public class FindIndexFromStart {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5 ;
        System.out.println(find(arr , target , 0));

    }

    static int find (int[] arr , int target , int index){
        if(index == arr.length){
            return -1 ;
        }
        if(arr[index] == target){
            return index ;
        }
        return find(arr , target , index + 1);
    }
}
