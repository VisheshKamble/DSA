package Searching;
//1095. Find in Mountain Array
public class FindInMountainArray {
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int peakIndex = findPeak(arr);
        int result = orderAgnosticBS(arr, target, 0, peakIndex);
        if (result == -1) {
            result = orderAgnosticBS(arr, target, peakIndex + 1, arr.length - 1);
        }
        System.out.println("Index of target: " + result);
    }

    static int findPeak(int[]arr){
        int start  = 0 ; 
        int end = arr.length -1 ;
        while (start < end) {
            int mid =  start + (end - start) / 2;
            if (arr[mid] < arr[mid+1]){
                start = mid + 1 ;
            }else{
                end = mid -1 ;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr , int target  , int start , int end){
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
