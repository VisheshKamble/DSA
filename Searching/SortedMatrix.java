package Searching;
import java.util.*;

public class SortedMatrix {
    public static void main (String[] args){
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[] ans = search(matrix, 9);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] matrix, int target) {
       int row = 0 ;
       int col = matrix[0].length -1 ;
       while(row < matrix.length && col >= 0){
        if(matrix[row][col] == target){
            return new  int[] {row, col};
        }
        if (matrix[row][col] > target){
            col--;
        } else {
            row++;
        }
    
    }
    return new int[] {-1, -1};
}
}
