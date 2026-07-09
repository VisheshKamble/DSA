package Recursion;

public class ReverseNumber {
    static int sum = 0;
    static void reverse(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
    }

    public static void main(String[] args){
        int n = 1234;
        reverse(n);
        System.out.println(sum);
    }
}