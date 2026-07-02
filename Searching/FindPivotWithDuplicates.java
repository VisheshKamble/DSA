package Searching;

public class FindPivotWithDuplicates {
    public static void main(String[] args){
        int[] arr = {2,2,2,3,4,2};
        int pivot = findPivotWithDuplicates(arr);
        System.out.println(pivot);

    }
    static int findPivotWithDuplicates(int[] arr){
        int start = 0 ;
        int end = arr.length - 1;
        while (start <= end){
            int mid =  start + (end - start) / 2;
            //case 1
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid ;
            }
            //case 2
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1 ;
            }   
            //if elements at middle , start , end are equal then just skip the duplicates

            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates 
                //NOTE : WHat if the start are my pivot ?
                if (arr[start] > arr [start + 1]){
                    return start ;
                }
                start ++ ;
                //NOTE : What if the end is my pivot ?
                if (arr[end] < arr[end - 1]){
                    return end - 1 ;
                }
                end -- ;
            }else if (arr[start] < arr[mid] ||  arr[start] == arr [mid] && arr[mid] > arr[end] ){
                start = mid + 1 ;
            }else {
                end = mid - 1 ;
            }

        }
        return -1 ;
    }
}
