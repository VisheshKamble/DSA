package Recursion;
//Q. num is given 5 print 1 to 5 in reverse order using recursion
public class NumReverse {
    public static void main(String[] args){
    int n = 5 ;
    numRev(n);
    }
    
    static void numRev(int n ){
        if(n == 0 ){
            return;
        }

        numRev(n-1);
        System.out.println(n);
    }
}
