package BackTracking;

public class Maze {
    public static void main(String[] args){
        int r = 3;
        int c = 3;
        System.out.println(maze(r , c));

    }

    static int maze (int r , int c){
        if(r == 1 || c == 1){
            return 1 ;
        }
        int left = maze(r - 1 , c);
        int right = maze ( r , c - 1);
        return left + right ;
    }
}
