package LinkedList;

public class main {
    
    public static void main (String[] args) {
        //when you initialize the LL the head and tail will be null and size will be 0
        LL list = new LL();

        list.insertFirst(9);
        list.insertFirst(8);
        list.insertFirst(7);
        list.insertFirst(17);

        list.display();
    }
}
