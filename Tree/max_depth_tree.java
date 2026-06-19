package Tree;

import javax.swing.tree.TreeNode;

public class max_depth_tree {
        int solve(TreeNode curr,int len){
        if(curr == null){
            return len;
        }

        return Math.max(solve(curr.left, len + 1),solve(curr.right, len + 1));
    }
    public int maxDepth(TreeNode root) {
        return solve(root,0);
    }
}
