package BinaryTree;

public class KthLevel {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void print(Node n, int k, int l){
        if(n == null) return;

        if(k == l) System.out.print(n.data+" ");

        print(n.left, k, l+1);
        print(n.right, k, l+1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);

        print(root, 1, 1);
        // for (int i = 0; i < 3; i++) {
        //     print(root, i, 0);
        //     System.out.println();
        // }
    }
}
