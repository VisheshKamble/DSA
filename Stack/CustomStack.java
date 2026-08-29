package Stack;
import java.util.* ;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    CustomStack() {
        this(DEFAULT_SIZE);
    }
    
    CustomStack(int size) {
        this.data = new int[size];
    }

}