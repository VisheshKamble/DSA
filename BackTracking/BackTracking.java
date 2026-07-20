package BackTracking;
//all paths down right left up
public class BackTracking {
    public static void main (String[] args){
        boolean[][] maze = {
                {true , true , true},
                {true , true , true},
                {true , true , true}
        };
        int r = 0 ;
        int c = 0 ;
        backtracking("", maze , r , c);

    }

    static void backtracking (String p , boolean[][] maze ,int r , int c){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return ;
        }

        if(maze[r][c] == false){
            return ;
        }

        maze[r][c] = false ;

        if(r < maze.length - 1){
            backtracking(p + 'D' , maze , r + 1 , c);
        }

        if ( c < maze[0].length - 1){
            backtracking(p + 'R' , maze , r , c + 1);
        }

        if (r > 0){
            backtracking(p + 'U' , maze , r -1 , c);

        }

        if(c > 0){
            backtracking(p + 'L' , maze , r , c - 1);
        }


      //this is the line where we are backtracking and making the cell true again so that it can be used in other paths
        maze[r][c] = true ;

    }
}