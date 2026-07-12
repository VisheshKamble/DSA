public class MergeSortInPlace {
    public static void main(String[] args){


    }
    static void mergeSort(int[] arr , int s , int e){
        if(e - s == 1){
            return ;
        }

        int mid = (s + e) / 2 ;

        mergeSort(arr , s , mid);
        mergeSort(arr , mid , e);

        merge(arr , s , mid , e);
    }

    static void merge(int[] arr , int s , int mid , int e){
        int[] mix = new int[e - s] ;

        int i = s ; //first array iterator
        int j = mid ; //second array iterator
        int k = 0 ; //mix array iterator

        while (i < mid && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++ ;
        }

        // it may be possible that one of the arrays is not completely traversed
        //copy the remaining elements
        while ( i < mid){
            mix[k] = arr[i];
            i++ ;
            k++;
        }

        while ( j < e){
            mix[k] = arr[j];
            j++ ;
            k++;
        }

        for(int l = 0 ; l < mix.length ; l++){
            arr[s + l] = mix[l];
        }
    } 
}
