package Stack;

public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }
    //beacuse we are extending the CustomStack class, we can use the push method of the CustomStack class and override it to make it dynamic.
    @Override
    public boolean push(int item) throws StackExpection {
        if(this.isFull()){
            System.out.println("Stack is full, doubling the size");
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        //at this point the stack is not full, so we can push the item to the stack
        return super.push(item);
    }
    
}
