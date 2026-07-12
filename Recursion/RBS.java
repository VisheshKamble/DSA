package Recursion;

public class RBS {
   public static void main (String[] args){
    int[] arr = {4,5,6,7,0,1,2};
    int target = 0;
    int ans = rbs(arr , target , 0 , arr.length - 1);
    System.out.println(ans);

   }

   static int rbs (int [] arr , int target , int start , int end){
    if (start > end){
        return -1;
    }

    int mid = start + (end - start) / 2;

    if(arr[mid] == target){
        return mid;
    }

    if(arr[start] <= arr[mid]){
        if(target >= arr[start]  && target <= arr[mid]){
            return rbs(arr , target , start , mid - 1);
        }else{
            return rbs(arr , target , mid + 1 , end);
        }
    }

    if (target >= arr[mid] && target <= arr[end]){
        return rbs(arr , target , mid + 1 , end);
    }
    return rbs(arr , target , start , mid - 1);
   }
}
