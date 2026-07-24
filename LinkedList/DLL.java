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


    //insert at the end of the doubly linked list

    public void insertLast(int val){

        Node node = new Node(val);
        node.next = null ;


        if(head == null){
            node.prev = null ;
            head = node ;
            return ;
        }


         Node last = head ;

        while(last.next != null ){
            last = last.next ;
        }

        last.next = node ;
        node.prev = last ;
    }


    //find a node with a specific value in the doubly linked list

    public Node find (int value){
        Node node = head ;

        while(node.next != null){
            if(node.val == value){
                return node ;
            }
            node = node.next ;
        }
        return null ;
    }


    //insert a new node after a specific node in the doubly linked list


    public void inseretAfter (int after , int val ){

        Node p = find(after);

        if(p == null){
            System.out.println("does not exist");
            return ;
        }

        Node node = new Node(val);

        node.next = p.next ;
        p.next = node ;
        node.prev = p ;
        if(node.next != null){
            node.next.prev = node ;
        }
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
