package BinaryTree;
import java.util.Scanner;

public class binarytree {

    public binarytree(){
    }

    private static class Node {
        int val ;
        Node left ;
        Node right;

        public Node(int val){
            this.val = val ;
            this.left = null;
            this.right = null;
        }
    }

    private Node root ;


    //insert a node in the binary tree
    public void populate(Scanner scanner){
        System.out.println("Enter the value of the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);

        populateHelper(root, scanner);
    }

    private void populateHelper(Node node , Scanner scanner){
        System.out.println("Do you want to add left of Node -> " + node.val);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left node -> " + node.val);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populateHelper(node.left, scanner);
        }

        System.out.println("Do you want to add right of Node -> " + node.val);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right node -> " + node.val);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populateHelper(node.right, scanner);
        }
    }

    public void display(){
        displayHelper(root , "");
    }

    private void displayHelper(Node node , String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.val);
        displayHelper(node.left, indent + "\t");
        displayHelper(node.right, indent + "\t");
    }
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        binarytree tree = new binarytree();
        tree.populate(scanner);
        System.out.println("Binary Tree Structure:");
        tree.display();
    }
    
}
