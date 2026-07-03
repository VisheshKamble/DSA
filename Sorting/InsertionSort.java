package Sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for(int i = 0 ; i <= arr.length - 2 ; i++){
            for (int j = 1 ; j <= arr.length - 1 ; j++){
                if(arr[j] < arr[j-1]){
                    //swap 
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ; 
                }else{
                    break;
                }
            }
        }
    }
}
