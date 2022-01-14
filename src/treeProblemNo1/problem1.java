package treeProblemNo1;

public class problem1 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        printInorder(root);
        System.out.println();
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.right.left = new Node(5);
        root1.right.right = new Node(6);
        root1.right.left.left = new Node(7);
        root1.right.left.right = new Node(8);
        printInorder(root1);
        System.out.println();
        int result = countLeaf(root1);
        System.out.println(result);
        if (isIdentical(root,root1)){
            System.out.println("Given two tree are identical");
        }
        else{
            System.out.println("Given two tree are not identical");
        }

    }
    public static void printInorder(Node root){
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
    //Write an efficient algorithm to check if two binary trees are identical or not. Two binary trees are
    // identical if they have identical structure and their contents are also the same.
    public static boolean isIdentical(Node root1,Node root2){
        if (root1 == null && root2==null) return true;
        return (root1 != null && root2 != null) && (root1.data == root2.data) &&  isIdentical(root1.left, root2.left) &&
                isIdentical(root1.right, root2.right);

    }
    //Given a binary tree, count the number of leaves in it. A node having no child node is called a leaf.
    public static int countLeaf(Node root){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        else {
            return (countLeaf(root.left) + (countLeaf(root.right)));
        }
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
