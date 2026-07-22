package LinkedList;

public class LL {

    private Node head ;
    private Node tail ;
    private int size ;

    public LL (){
        this.size = 0 ;
    }
    

    public void insertFirst (int val){
        Node node = new Node(val); //creating a new node with the value
        node.next = head ; //pointing the new node to the head
        head = node ; //updating the head to the new node

        if(tail == null){
            tail = head ; //if the list was empty, tail should also point to the new node 
        }

        size++ ; //incrementing the size of the list
    }

    public void display(){
        Node temp = head ;

        while (temp != null){
            System.out.print(temp.val + "-->") ;
            temp = temp.next ;
        }
        System.out.println("END");
    }

    private class Node {
        private int val ;
        private Node next ;
       
        //constructor only value
        private Node (int val){
            this.val = val ;
        }
       
        //constructor value and next
        private Node (int val , Node next){
            this.val = val ;
            this.next = next ;
        }

    }
}
