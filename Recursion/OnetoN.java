package Recursion;

public class OnetoN {
    public static void main(String[] args){
        int n = 1 ;
        print1toN(n);

    }

    static void print1toN(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        print1toN(n+1);
    }
}
