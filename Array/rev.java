import java.util.* ;
public class rev {
    public static void main(String[] args) {
        int [] arr = { 23 , 45, 100, 67 ,89};

        rev(arr);
        System.out.println(Arrays.toString(arr));
 
    }

    static void rev (int[] arr){
        int start = 0 ;
        int end = arr.length - 1 ;
        while ( start < end){
            swap (arr , start , end);
            start++;
            end--;
        }
    }

    
    static void swap (int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
