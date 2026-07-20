package BackTracking;
import java.util.*;

public class PathPrint {
    public static void main (String[] args){
          boolean[][] maze = {
                {true , true , true},
                {true , true , true},
                {true , true , true}
        };

        int[][] path = new int[maze.length][ maze[0].length];

        pathPrint( "", maze, 0, 0, path, 1);
        

    }

    static void pathPrint (String p , boolean[][] maze , int r , int c , int[][] path , int size){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = size ;
            
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return ;
        }

        if (maze[r][c] == false){
            return;
        }

        maze[r][c] = false ;
        path[r][c] = size;

        if(r < maze.length - 1){
            pathPrint(p + 'D', maze, r + 1 , c, path, size + 1);
        }

        if(c < maze[0].length - 1){
            pathPrint(p + 'R' , maze , r , c + 1 , path , size + 1 );
        }

        if(r > 0){
            pathPrint(p + 'U' , maze , r - 1 , c , path , size + 1);
        }

        if (c > 0){
            pathPrint(p + 'L', maze, r, c - 1, path, size + 1);
        }
       //where it comes out from
        maze[r][c] = true ;
        path[r][c] = 0;
    }
}
