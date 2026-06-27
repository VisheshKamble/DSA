import java.util.Scanner;
import java.util.Arrays;
public class MultidimensionalArray {
    public static void main(String[] args) {

        int [][] arr = new int [3][3] ; // 3 rows and 3 columns

        Scanner in = new Scanner(System.in);

        //input
        for ( int row = 0 ; row < arr.length ; row++){

            for (int col = 0 ; col < arr[row].length ; col++){
                arr[row][col] = in.nextInt();
            }
        }

        //output
        for(int row = 0 ; row < arr.length ; row++){

            for (int col = 0 ; col < arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
           
        }

        //output using toString
        for(int row = 0 ; row < arr.length ; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        //using enhanced for loop
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
