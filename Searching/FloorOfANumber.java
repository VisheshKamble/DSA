package Searching;
//Floor of a number is the largest number in the array which is smaller than or equal to target number
public class FloorOfANumber {
     public static void main(String[] args){
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15 ;
        int ans = floorOfANumber(arr , target) ;
        System.out.println(ans);

     }

     static int floorOfANumber(int[] arr ,int target){
        int start = 0 ; 
        int end = arr.length - 1 ;

        while (start <= end){
            int mid = start  + (end - start) / 2 ;
            if (arr[mid] == target){
                return mid ;
            }
            else if (arr[mid] < target){
                start = mid + 1 ;
            }
            else{
                end = mid - 1 ;
            }
        }
        return end ; // Return the floor value
     }
}
