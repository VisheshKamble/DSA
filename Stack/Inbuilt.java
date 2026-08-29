package Stack;

import java.util.* ;

public class Inbuilt {
    public static void main(String[] args){

        //S T A C K  IN  B U I L T  J A V A

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);  
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
