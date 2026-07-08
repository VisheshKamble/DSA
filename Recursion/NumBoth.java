package Recursion;

public class NumBoth {
    public static void main(String[] args){
    int n = 5 ;
    numBoth(n);
    }

    static void numBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        numBoth(n-1);
        System.out.println(n);
    }
}
