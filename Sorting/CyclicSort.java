
import java.util.Arrays;

//when ever we have to sort the numbers from 1 to n then we can use cyclic sort because it will place the numbers at their correct index
public class CyclicSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i = 0 ;
        while(i < arr.length){
            int correct = arr[i] - 1 ;
            if(arr[i] != arr[correct]){
                //swap
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp ;
            } else {
                i++ ;
            }
        }
    }
    
}
