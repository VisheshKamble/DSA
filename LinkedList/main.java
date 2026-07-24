package LinkedList;

public class main {
    
    public static void main( String[] args) {
        //when you initialize the LL the head and tail will be null and size will be 0
     
     // S I N G L Y L I N K E D  L I S T


     // LL list = new LL();

      //  list.insertFirst(9);
      //  list.insertFirst(8);
      //  list.insertFirst(7);
      // list.insertFirst(17);
      // list.insertLast(10);
      // list.insert(15, 2);
        
       // list.display();
        
        //System.out.println("Deleted: " + list.deleteFirst());

        //list.display();

        //System.out.println("Deleted: " + list.deleteLast());

       // System.out.println("Deleted: " + list.delete(2));

       // list.display();


       // D O U B L Y  L I N K E D  L I S T

        // DLL list = new DLL();

        // list.insertFirst(9);
        // list.insertFirst(8);
        // list.insertFirst(7);
        // list.insertFirst(17);
        // list.insertLast(10);
        // list.inseretAfter(8, 15);

        // list.display();


    // C I R C U L A R  L I N K E D  L I S T

    CLL list = new CLL();

    list.insert(9);
    list.insert(8);
    list.insert(7);
    list.insert(17);
    list.insert(10);
    list.delete(7);

    list.display();

    }
}
