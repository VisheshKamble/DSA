
//leetcode 287. Find the Duplicate Number
public class FindDuplicateNumber {
    public static void main(String[] args){
        int[] arr = {1,3,4,2,2};
        int duplicate = findDuplicate(arr);
        System.out.println(duplicate);
    }
    static int findDuplicate(int[] arr){
        int i = 0 ;
        while (i < arr.length){
            int correct = arr[i] - 1 ;
            if (arr[i] != arr[correct]){
                //swap
                int temp = arr[i] ;
                arr[i] = arr[correct] ;
                arr[correct] = temp ;
            } else {
                i++ ;
            }
        }

        for (int index = 0 ; index < arr.length ; index++){
            if(arr[index] != index + 1){
                return arr[index];
            }
        }
        return -1 ;
    }
}
