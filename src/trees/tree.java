package trees;

import java.util.Scanner;

public class tree {
     static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
           Node root =  createTree();
           printInorder(root);
            System.out.println();
           printPreOrder(root);
            System.out.println();
           printPostOrder(root);

    }
    static Node createTree(){
        Node root;
        root = null;
        System.out.println("Enter the data:");
        int data = sc.nextInt();

        if (data == -1) return null;
        root = new Node(data);

        System.out.println("Enter the data for left: "+ data);
        root.left = createTree();

        System.out.println("Enter the data for right: "+data);
        root.right = createTree();

        return root;
    }
    static void printInorder(Node root){
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
    static void printPreOrder(Node root){
        if (root == null) return;

        System.out.print(root.data+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    static void printPostOrder(Node root){
        if (root == null) return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data+" ");
    }
}
class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}
