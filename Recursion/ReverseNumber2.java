package Recursion;

public class ReverseNumber2{
    public static void main (String[] args){
        int n = 1234;
        int reversed = reverse(n);
        System.out.println(reversed);
    }

    static int reverse(int n){
        if ( n%10 == n){
            return n ;
        }

        int digits = (int) Math.log10(n) + 1 ;

        int rem = n % 10 ;

        return rem * (int) Math.pow(10 , digits - 1) + reverse(n/10) ;
       
    }
}