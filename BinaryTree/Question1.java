package BinaryTree;

public class Question1 {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static boolean isUni(Node node){
        if(node == null) return true;

        if(node.left != null && node.left.data != node.data) return false;
        if(node.right != null && node.right.data != node.data) return false;
        return isUni(node.left) && isUni(node.right);
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(1);
        root.right.right = new Node(1);

        System.out.println(isUni(root));
    }
}

//https://leetcode.com/problems/univalued-binary-tree/
