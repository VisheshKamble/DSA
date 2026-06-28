public class FindMax {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 6};

        int max = findMax(arr , 1 , 4 );

        System.out.println("The maximum value in the array is: " + max);
    }
   //work on test cases where array is empty

   static int findMax (int[] arr , int start , int end){
       if (end < start){
        return -1 ;
       }

       if (arr == null || arr.length == 0){
        return -1;
       }

       int max = arr[start];
       for (int i = start ; i <= end ; i++){
           if (arr[i] > max){
               max = arr[i];
           }
       }
       return max;
    }



    //imagine that array is not empty
    //static int findMax (int[] arr){
    //    int max = arr[0];
    //    for (int i = 1 ; i < arr.length ; i++){
    //        if(arr[i] > max){
    //            max = arr[i];
    //        }
            
    //    }
    //    return max;
   // }

}

