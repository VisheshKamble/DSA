
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //it will not create a new array but will sort the existing array thats why return type is void
    static void bubbleSort(int[] arr){
        boolean swapped ;
        //run the steps n - 1 times 
        for (int i = 0 ; i < arr.length ; i++ ){
            swapped = false;
            //run through the array from 0 to n - i - 1 because after every iteration the largest element will come at the end of the array
            for (int j = 1 ; j < arr.length - i ; j++){
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }

    }
}