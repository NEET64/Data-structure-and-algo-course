import java.util.*;

public class Question2 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int dep = 0;
        q.offer(root);
        TreeNode cur;
        int size=0;
        while(!q.isEmpty()){
            dep++;
            size = q.size();
            while(--size>=0){
                cur = q.poll();
                if(cur.left == null && cur.right == null) return dep;
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);
            }
        }
        return dep;
    }

    public static void main(String[] args) {
        // https://leetcode.com/problems/minimum-depth-of-binary-tree/  
        // https://practice.geeksforgeeks.org/problems/minimum-depth-of-a-binary-tree/1
    }
}
