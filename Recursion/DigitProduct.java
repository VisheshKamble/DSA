package Recursion;

public class DigitProduct {
    public static void main(String[] args){
        int n = 1234 ;
        int ans = digitProduct(n);
        System.out.println(ans);

    }
    static int digitProduct(int n){
        if(n == 0){
            return 1;
        }
        return (n%10) * digitProduct(n/10);
    }
}
