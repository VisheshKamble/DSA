package BinarySearchTree;

public class binarySearchTree {
    public class Node {
        private int value ;
        private int height ;
        private Node left ;
        private Node right ;

        public Node(int value){
            this.value = value ;
        }
        // Getters and Setters
        public int getValue() {
            return value;
        }
    }

    private Node root ;

    public binarySearchTree(){
    }

    public int height(Node node){
        if(node == null){
            return -1 ;
        }

        return node.height ;
    }

    public boolean isEmpty(){
        return root == null ;
    }


    public void insert(int value){
        //in the end we will return the root node of the tree after insertion
        root = insertHelper(root , value);
       
    }

    private Node insertHelper(Node node , int value){
        if(node == null){
            return new Node(value);
        }

        if(value < node.getValue()){
            node.left = insertHelper(node.left , value );
        }

        if(value > node.getValue()){
            node.right = insertHelper(node.right , value);        
        
    }

    node.height = Math.max(height(node.left) , height(node.right)) + 1 ;

    return node ; 
}

public void populateTree(int nums[]){
    for (int i = 0 ; i < nums.length ; i++){
        this.insert(nums[i]);
    }
}


 public boolean balanced(){
        return balancedHelper(root);
    }

    private boolean balancedHelper(Node node){
        if(node == null){
            return true ;
        }

      return Math.abs(height(node.left) - height(node.right)) <= 1 && balancedHelper(node.left) && balancedHelper(node.right) ;
    }


    public void display(){
        displayHelper(root , "Root Node : ");
    }

    private void displayHelper (Node node , String details){
        if(node ==  null){
            return ;
        }

        System.out.println(details + node.getValue());

        displayHelper(node.left , "Left Node of :" + node.getValue() + " : ");
        displayHelper(node.right , "Right Node of :" + node.getValue() + " : ");

    }

    public static void main(String[] args) {
        binarySearchTree bst = new binarySearchTree();
        int nums[] = { 10 , 5 , 15 , 3 , 7 , 12 , 17};
        bst.populateTree(nums);
        bst.display();
    } 

}