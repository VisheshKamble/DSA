package LinkedList;

public class DLL {

    private Node head ;

    public void insertFirst(int val){
        Node node = new Node(val);

        node.next = head ;

        node.prev = null ;

        if(head!=null){
            head.prev = node ;
        }

        head = node;
    }


//display the doubly linked list

    public void display(){
        Node temp = head ;

        Node last = null ;
        while (temp != null){
            System.out.print(temp.val + "<->") ;
            last = temp ;
            temp = temp.next ;

        }
        System.out.println("END");


        System.out.println("Display in reverse order");

        while(last != null){
            System.out.print(last.val + "<->") ;
            last = last.prev ;
        }
        System.out.println("START");
    }

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
