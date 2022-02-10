/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean result = true;
    public boolean isBalanced(TreeNode root) {
        maxDepthTree(root);
        return result;
    }
    
    public int maxDepthTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int right = maxDepthTree(root.right);
        int left = maxDepthTree(root.left);
        if(Math.abs(right-left)>1){
            result = false;
            return 0;
        }
        return 1+Math.max(right,left);
    }
}