import java.util.Arrays;
// MergeSort algorithm implementation in Java
public class MergeSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr ;
        }

        int mid = arr.length / 2 ;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid ));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left , right);

    }
    

    static int[] merge(int[] first , int[] second){
        int[] mix = new int [first.length + second.length] ;

        int i = 0 ; //first array iterator
        int j = 0 ; //second array iterator
        int  k =  0 ; //mix array iterator


        while (i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++ ;
            }else{
                mix[k] = second[j];
                j++ ;
            }
            k++;
        }
        // it may be possible that one of the arrays is not completely traversed
        //copy the remaining elements
        while ( i < first.length){
            mix[k] = first[i];
            i++ ;
            k++;
        }

        while ( j < second.length){
            mix[k] = second[j];
            j++ ;
            k++;
        }
        return mix;
    }
}
