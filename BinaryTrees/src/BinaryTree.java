import java.util.Scanner;

public class BinaryTree {


    public BinaryTree(){

    }
    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
        private Node root;

    // insert elements
    public void populate(Scanner in){
        System.out.println("Enter the root Node");
        int value = in.nextInt();
        Node root = new Node(value);
        populate(in,root);
    }

    private void populate(Scanner in, Node node) {
        System.out.println("do you want to enter the left node "+node.value);
        boolean left = in.nextBoolean();
        if(left){
            System.out.println("enter the value of leftnode"+node.value);
            int value= in.nextInt();
            node.left=new Node(value);
            populate(in,node.left);
        }
        System.out.println("do you want to enter the right node "+node.value);
        boolean right = in.nextBoolean();
        if(right){
            System.out.println("enter the value of rightnode"+node.value);
            int value= in.nextInt();
            node.right=new Node(value);
            populate(in,node.right);
        }
    }
    public void display(){
        display(this.root, "");
    }
    private void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent + "\t");
        display(node.right,indent+ "\t");
    }


}

