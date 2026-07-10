package Recursion;

public class FindTargetFromLast {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int target = 1;
        System.out.println(find(arr, target , arr.length - 1));

    }

    static int find(int[] arr , int target , int index){
        if (index == -1){
            return -1;
        }

        if(arr[index] == target){
            return index ;
        }
        return find(arr, target , index - 1) ;
    }
}
