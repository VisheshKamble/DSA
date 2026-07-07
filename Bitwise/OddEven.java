package Bitwise ;
public class OddEven {
    public static void main(String[] args){
        int n = 17 ;
        System.out.println(isEven(n));

    }

    static boolean isEven(int n){
        return (n & 1) == 0 ;
    }
    
}
