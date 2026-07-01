package Searching;

// leetcode 33. Search in Rotated Sorted Array
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 1;
        int ans = findInRotatedArray(arr, target);
        System.out.println(ans);
    }

    static int findInRotatedArray(int[] arr, int target) {
        int pivot = findPivot(arr);
        // case 1
        if (arr[pivot] == target) {
            return pivot;
        } else if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        } else if (arr[0] < target) {
            return binarySearch(arr, target, 0, pivot - 1);
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
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

    static int findPivot(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {

        int mid = start + (end - start) / 2;

        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        }

        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }

        if (arr[start] >= arr[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }

    return -1;
}
        
    }


