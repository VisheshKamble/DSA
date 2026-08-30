package Stack;
import java.util.* ;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1 ;

    CustomStack() {
        this(DEFAULT_SIZE);
    }
    
    CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){

        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }

         ptr++;

        data[ptr] = item;
        return true;

    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

}