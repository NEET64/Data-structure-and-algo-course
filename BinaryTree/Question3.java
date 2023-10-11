package BinaryTree;

public class Question3 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void remove(Node root, int k){
        if(root == null) return;
        remove(root.left,k);
        remove(root.right,k);
        if(root.left != null && root.left.left == null && root.left.right == null && root.left.data == k) root.left = null;
        if(root.right != null && root.right.left == null && root.right.right == null && root.right.data == k) root.right = null;
    }

    public static void preOrder(Node node) {
        if(node == null){
            System.out.print("-1 ");
            return;
        }

        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(7);

        //      1
        //   2     7
        // 4   5  7  7 

        preOrder(root);
        remove(root, 7);
        System.out.println();
        preOrder(root);
    }
}
