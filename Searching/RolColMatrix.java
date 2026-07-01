package Searching;
import java.util.*;

public class RolColMatrix {
    public static void main (String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16}
        };
        int[] result = search(matrix, 5);
        System.out.println(Arrays.toString(result));
}
static int[] search(int[][] matrix, int target) {
    int row = 0 ;
    int columns = matrix.length -1 ;
    while ( row < matrix.length && columns >= 0){
        if (matrix[row][columns] == target) {
            return new int[] {row, columns};
        }
        if(matrix[row][columns] < target){
            row++;
        } else {
            columns--;
        }
    }
    return new int[] {-1, -1};
}
}
