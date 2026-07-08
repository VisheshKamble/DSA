package Recursion;

public class Sum {
    public static void main(String[] args){
        int n = 5 ;
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
    static int sum (int n){
        if ( n <= 1){
            return n ; // base case : Sum of first 0 and 1 natural numbers is 0 and 1 respectively
        }

        return n + sum(n-1); // recursive case
    }
}
