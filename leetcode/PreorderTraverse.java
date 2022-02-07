package leetcode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


class PreorderTraverse {
    // Definition for a binary tree node.
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
    public List<Integer> preorderTraverse(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while (cur!=null || !stack.empty()) {
            while(cur!=null){
                list.add(cur.val);
                stack.add(cur);
                cur= cur.left;
            }
            cur = stack.pop();
            cur = cur.right;
        }
        return list;
    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        PreorderTraverse()
    }
}

