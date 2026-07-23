package LinkedList;

//main class to test the linked list implementation
public class LL {

    private Node head ;
    private Node tail ;
    private int size ;

    public LL (){
        this.size = 0 ;
    }
    
//Insert a new node at the beginning of the list
    public void insertFirst (int val){
        Node node = new Node(val); //creating a new node with the value
        node.next = head ; //pointing the new node to the head
        head = node ; //updating the head to the new node

        if(tail == null){
            tail = head ; //if the list was empty, tail should also point to the new node 
        }

        size++ ; //incrementing the size of the list
    }

//Insert a new node at the end of the list
    public void insertLast (int val){

        if(tail == null){
            insertFirst(val); //if the list is empty, we can just call insertFirst to handle the insertion
            return ;
        }
        Node node = new Node(val); //creating a new node with the value
        tail.next = node ; //pointing the current tail to the new node
        tail = node ; //updating the tail to the new node
        size++ ; //incrementing the size of the list
    }


  //insert a new node at a specific index in the list
    public void insert (int val , int index){

        if(index == 0){
            insertFirst(val);
            return ;
        }

        if(index == size){
            insertLast(val);
            return ;
        }

        Node temp = head ;
        for (int i = 1 ; i < index ; i++){
            temp = temp.next ;
        }
        Node node = new Node (val , temp.next);
        temp.next = node ;
        size++ ;
    }


  //Delete the first node of the list
  
  public int deleteFirst(){
    int val = head.val ;
    head = head.next ;
    if (head == null) {
      tail = null ;
    }
    size-- ;
    return val ;
  }

  //Delete the last node of the list

  public int deleteLast(){

    if(size <= 1){
        return deleteFirst() ;
    }

    Node secondLast = get(size - 2);

    int val = tail.val ;
    tail = secondLast ;
    tail.next = null ;
    size-- ;
    return val ;
}

  //get function to retrieve the value of a node at a specific index

  public Node get (int index){
    Node node = head ;
    for (int i = 0 ; i < index ; i++){
        node = node.next ;
    }
    return node ;
  }

  //Display the linked list  
    public void display(){
        Node temp = head ;

        while (temp != null){
            System.out.print(temp.val + "-->") ;
            temp = temp.next ;
        }
        System.out.println("END");
    }

//Inner class for Node
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
