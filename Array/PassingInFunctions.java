import java.util.Arrays;
public class PassingInFunctions {
    public static void main(String[] args) {
        int[] num = {3,4,1,4,1} ; 
        
        System.out.print(Arrays.toString(num));

        change(num);

        System.out.print(Arrays.toString(num));

    }

    static void change (int[] arr) {
        arr[3] = 108 ;
    }
}
