package Recursion;

public class CountZero {
    public static void main(String[] args){
        int n = 1002003 ;
        System.out.println(count(n));

    }

    static int count(int n){
        return helper(n, 0);
    }
 //special pattern to pass value in recursion function lower function to upper function
     public static int helper(int n , int count){
        if(n == 0){
            return count ;
        }

        int rem  = n % 10 ;
        if ( rem  == 0 ){
            return helper (n / 10 , count + 1) ; 

        }

        return helper (n / 10 , count) ;
    }
}
