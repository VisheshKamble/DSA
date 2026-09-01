package Queue;

public class queuemain {
    
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.front());
    }
}
