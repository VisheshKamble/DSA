package Searching;
// leetcode 81. Search in Rotated Sorted Array II
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    public static int search (int[] arr , int target){
        int start  = 0 ;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end -start ) / 2 ;
            if (arr[mid] == target){
                return mid ;
            }
            if (arr[start] == arr[mid] && arr[end] == arr[mid]){
                start ++ ;
                end -- ;

            } 
            //left side is sorted
            else if(arr[start] <= arr[mid]){
                if (target >= arr[start] && target < arr[mid]){
                    end = mid - 1 ;
                } else {
                    start = mid + 1 ;
                }
                
            }
            //right side is sorted
            else {
                    if(target > arr[mid] && target <= arr[end]){
                        start = mid + 1 ;
                    } else {
                        end = mid - 1 ;
                    }
                }
                
            }  
            
    return -1 ;
    }
}
