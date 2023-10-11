package BinaryTree;

public class Question2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static void invert(Node root) {
        if(root == null) return;

        Node left = root.left;
        Node right = root.right;

        invert(root.left);
        invert(root.right); 

        root.left = right;
        root.right = left;
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
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        preOrder(root);
        invert(root);
        System.out.println();
        preOrder(root);
    }
}

// https://leetcode.com/problems/invert-binary-tree/submissions/914513168/
