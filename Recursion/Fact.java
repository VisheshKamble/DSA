package Recursion;

public class Fact {
    public static void main(String[] args){
        int n = 5 ;
        int result = fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
    static int fact (int n){
        if ( n <= 1){
            return 1 ; // base case : Factorial of 0 and 1 is 1
        }

        return n * fact(n-1); // recursive case
    }
}
