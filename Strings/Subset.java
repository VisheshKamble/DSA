package Strings;
import java.util.List;
import java.util.ArrayList;

public class Subset {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(subset(arr)); 

    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>(); // outer will be the list of lists that will contain all the subsets

        //initially we will have an empty subset
        outer.add(new ArrayList<>());

        // as we are now using iterative approach, we will be using for loop to iterate through the array

        for (int num : arr){
            int n = outer.size(); // we will get the size of the outer list, which will be used to iterate through the existing subsets
        
            for (int i = 0 ; i < n ; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i)); // copy the existing subset from the outer list to the internal list
            internal.add(num); // we will add the current number to the existing subset

            outer.add(internal);
            
            }
        
        }

return outer ;
        
    }
}
