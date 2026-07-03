
import java.util.List;
import java.util.ArrayList;

public class FindAllMissing {
    public static void main (String[] args){
        // example
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findAllMissingNumbers(arr));
    }

    static List<Integer> findAllMissingNumbers(int[] arr){
        int i = 0 ;
        while (i < arr.length){
            int correct = arr[i] - 1 ;
            if(arr[i] != arr[correct]){
                //swap
                int temp = arr[i] ;
                arr[i] = arr[correct] ;
                arr[correct] = temp ;
            } else {
                i++ ;
            }
        }

        List<Integer> missingNumbers = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                missingNumbers.add(j + 1);
            }
        }
        return missingNumbers;
    }
}