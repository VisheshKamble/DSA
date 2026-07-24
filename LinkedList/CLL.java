package LinkedList;

public class CLL {

    private Node head ;
    private Node tail ;


    public void insert(int val) {
        Node node = new Node(val);

        if(head == null){
            head = node ;
            tail = node ;
            node.next = head ;
            return ;
        }
    
        tail.next = node ;
        node.next = head ;
        tail = node ;
    

    }


    public void display(){

        Node temp = head ;
   //use do while as it is circular linked list and we want to print all the nodes in the list
        if(head != null){
            do{
                System.out.print(temp.val + "-->");
                temp = temp.next ;
        } while(temp != head);
      System.out.println("HEAD");
          
    }
}



    private class Node {
        int val ;
        Node next ;

        Node (int val){
            this.val = val ;
        }

        Node (int val , Node next){
            this.val = val ;
            this.next = next ;
        }
     }
    
}
