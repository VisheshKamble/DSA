package Searching;

public class MinimumElement {

    public static void main(String[] args){
        int[] arr = {34,25,1,542,54,2,3454,2345,432,34,31,31,23,2 ,49};
        int ans = minElement(arr);
        System.out.println(ans);

    }

    static int minElement(int[] arr){
        int min = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
    return min;
}
}