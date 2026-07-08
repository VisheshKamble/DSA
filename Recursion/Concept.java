package Recursion;

public class Concept {
    public static void main(String[] args){
        int n = 5 ;
        fun(n);
    }

    static void fun (int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        //fun(n--); // this will cause infinite loop because n-- will pass the current value of n to the function and then decrement it after the function call. So, the next recursive call will still receive the same value of n, leading to infinite recursion.
        // To fix this, we should use fun(n-1) instead of fun(n--). This way, we pass the decremented value of n to the next recursive call, allowing the recursion to eventually reach the base case and terminate.
        fun (--n); // this will work because --n will decrement the value of n before passing it to the function, so the next recursive call will receive the decremented value of n, allowing the recursion to eventually reach the base case and terminate.
    }
}