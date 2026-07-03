

// Leetcode 33. Missing Number
public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {3,0,1};
        int missing = missingNumber(arr);
        System.out.println(missing);
}

    static int missingNumber (int[]arr){
        int i = 0 ;
        while (i < arr.length ){
            int correct = arr[i] ;
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                //swap
                int temp = arr[i] ;
                arr[i] = arr[correct] ; 
                arr[correct] = temp ;
            }else {
                i++ ;
            }
        }

        for (int search = 0 ; search  < arr.length ; search++){
            if(arr[search] != search){
                return search ;
            }
        }
        return arr.length ;
    }
    
}
