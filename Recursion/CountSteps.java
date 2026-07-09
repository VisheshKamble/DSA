package Recursion;
//leetcode: 1342. Number of Steps to Reduce a Number to Zero
public class CountSteps {
    public static void main(String[] args){
        int n = 14 ;
        System.out.println(countSteps(n));
    }
    static int countSteps(int n){
        return helper (n , 0);
    }

    static int helper ( int n  , int steps){
        if (n == 0){
            return steps ;
        }

        if (n % 2 == 0){
            return helper (n / 2 , steps + 1);
        }

        return helper (n - 1 , steps + 1);
    }
}
