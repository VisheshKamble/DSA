package Searching;

public class linearSearch {
    public static void main(String[] args){
      int[] arr = {34,25,1,542,54,2,3454,2345,432,34,31,31,23,2 ,49};
      int target = 49;
      int ans = search(arr , target);
      System.out.println(ans);
    }

    static int search (int[] arr , int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index = 0 ; index < arr.length ; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
