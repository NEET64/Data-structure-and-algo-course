package BinaryTree;

public class BuildTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    static class BinaryTreeClass{
        static int idx = -1;
        public Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public void preOrder(Node node) {
            if(node == null){
                System.out.print("-1 ");
                return;
            }

            System.out.print(node.data+" ");
            preOrder(node.left);
            preOrder(node.right);
        }

        public void inOrder(Node node){
            if(node == null){
                System.out.print("-1 ");
                return;
            }

            inOrder(node.left);
            System.out.print(node.data+" ");
            inOrder(node.right);
        }

        public void postOrder(Node node){
            if(node == null){
                System.out.print("-1 ");
                return;
            }

            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data+" ");
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        BinaryTreeClass tree = new BinaryTreeClass();

        Node root = tree.buildTree(nodes);

        // tree.preOrder(root);
        // tree.inOrder(root);
        tree.postOrder(root);
    }
}
