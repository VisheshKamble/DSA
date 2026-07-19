package BackTracking;

public class PathAll {
    public static void main(String[] args){
        int r = 3;
        int c = 3;
        pathAll("" , r , c);


    }

    static void pathAll (String p , int r , int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return ;
        }

        if (r > 1 && c > 1){
            pathAll (p + 'D' , r - 1 , c - 1);
        }

        if ( r > 1){
            pathAll(p + 'V' , r -1 , c );
        }
        if (c > 1){
            pathAll(p + 'H' , r , c - 1);
        }
    }

}