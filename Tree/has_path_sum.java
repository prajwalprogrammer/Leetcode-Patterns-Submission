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
    public boolean hasSum(TreeNode root, int currSum){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            currSum -= root.val;
            return currSum == 0 ? true : false;
        }

        return hasSum(root.left, currSum - root.val) || hasSum(root.right, currSum - root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return hasSum(root, targetSum);
    }
}
