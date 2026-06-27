import java.util.Scanner;
import java.util.Arrays;
public class Input {
    public static void main (String[] args){
    Scanner in =  new Scanner(System.in);
    
    //Array Using one be one input 
    //Array Of Primitives
    int[] arr = new int[5];
    arr[0] = 23 ;
    arr[1] = 45 ;
    arr[2] = 67 ;
    arr[3] = 89 ;
    arr[4] = 90 ;

    System.out.println(arr[0]);

    for (int i = 0 ; i < arr.length ; i++){
        arr[i] = in.nextInt();
    }

    System.out.print(Arrays.toString(arr)); //Best way to print array in java

    //for (int i = 0 ; i < arr.length ; i++){
    //    System.out.print(" " + arr[i]);
    //}

    //for ( int num : arr){
    //    System.out.print(" " + num);
    //}


    //Array Of Objects
    String[] str = new String[5];

    for (int i = 0 ; i < str.length ; i++){
        str[i] = in.next();
    }
    System.out.print(Arrays.toString(str));
 }
}