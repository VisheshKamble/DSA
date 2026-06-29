package Searching;

//Ceiling of a number is the smallest number in the array which is greater than or equal to target number
public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18} ;
        int target = 15 ;
        int ans = ceilingOfANumber(arr , target) ;
        System.out.println(ans);

    }

    static int ceilingOfANumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return start;
    }

}
