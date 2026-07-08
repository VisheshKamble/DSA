package Recursion;

public class DigitSum {
    public static void main(String[] args){
        int n = 123456;
        int ans = digitSum(n);
        System.out.println(ans);
    }

    static int digitSum(int n){
        if ( n == 0 ){
            return 0 ;
        }

        return (n % 10) + digitSum(n / 10); // recursive case;
    }
}
