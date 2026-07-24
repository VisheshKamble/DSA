package LinkedList;

public class DLL {




    //Node class to represent each element in the doubly linked list
    private class Node {

        private int val ;
        private Node next ;
        private Node prev ;


        private Node(int val){
            this.val = val ;
        }

        private Node(int val, Node next, Node prev){
            this.val = val ;
            this.next = next ;
            this.prev = prev ;
        }
    }

}
