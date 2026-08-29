package Queue;

import java.util.* ;

public class Inbuilt {
    public static void main(String[] args){

        //Q U E U E  I N  B U I L T  J A V A

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);  
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}