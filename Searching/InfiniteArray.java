package Searching;
// geeks for geeks : Find position of the element in the sorted arrar of infinite numbers
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int result = ans(arr, target);
        System.out.println("Position of target: " + result);
        // Implementation for finding the position of target in infinite sorted array
    }

    static int ans (int[] arr , int target){
        int start = 0 ;
        int end = 1 ;
        while (arr[end] < target){
            int newStart = end + 1 ;
            end = end + (end - start + 1 ) * 2 ;
            start = newStart ;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr , int target , int start , int end){
        while (start <= end ){
            int mid = start  + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
