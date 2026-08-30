package Stack;
import java.util.* ;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1 ;

    CustomStack() {
        this(DEFAULT_SIZE);
    }
    
    CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        ptr++;

        if(ptr == data.length){
            System.out.println("Stack is full");
            return false;
        }

        data[ptr] = item;
        return true;

    }

    

}