package BackTracking;

public class Path {
    public static void main(String[] args){
        int r = 3;
        int c = 3;
        path("" , r , c);


    }

    static void path (String p , int r , int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return ;
        }

        if(r > 1){
            path (p + 'D' , r - 1 , c );
        }
        if(c > 1){
            path (p + 'R' , r , c - 1 );
        }
    }
}