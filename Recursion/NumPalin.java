package Recursion;

public class NumPalin {
    public static void main(String[] args){
        int n = 12321 ;
        System.out.println(isPalindrome(n));

    }

    static boolean isPalindrome(int n){
        return n == reverse(n) ;
    }

    static int reverse(int n){
        if ( n%10 == n){
            return n ;
        }

        int digits = (int) Math.log10(n) + 1 ;

        int rem = n % 10 ;

        return rem * (int) Math.pow(10 , digits - 1) + reverse (n / 10) ;
    }
}
