package Searching;

public class SearchInRange {
    public static void main (String[] args){
        int [] arr = {34,25,1,542,54,2,3454,2345,432,34,31,31,23,2 ,49};
        int target = 2345;
        int start = 3;
        int end = 14;
        int ans = searchInRange(arr , target , start , end);
        System.out.println(ans);
    }
    static int searchInRange(int[] arr , int target , int start , int end ){
        if (arr.length == 0){
            return -1;
        }
        for (int i = start ; i <= end ; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
