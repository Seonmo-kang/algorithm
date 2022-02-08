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
    public boolean isSymmetric(TreeNode root) {
        return root==null|| isSymmetricSupport(root.left,root.right);
    }
    private boolean isSymmetricSupport(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }
        if((left!=null&&right==null) || (left==null&&right!=null)){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        return isSymmetricSupport(left.left,right.right)&& isSymmetricSupport(left.right,right.left);
    }
}