import java.util.Arrays;
// QuickSort algorithm implementation in Java
public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int left = start;
        int right = end;

        int pivot = arr[(start + end) / 2];

        while (left <= right) {

            while (arr[left] < pivot) {
                left++;
            }

            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        quickSort(arr, start, right);
        quickSort(arr, left, end);
    }
}