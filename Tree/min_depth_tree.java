package Tree;

import javax.swing.tree.TreeNode;

public class min_depth_tree {
    int solve(TreeNode curr){
        if(curr == null){
            return 0;
        }
        int leftDep = solve(curr.left);
        int rightDep = solve(curr.right);
        if(leftDep == 0 || rightDep == 0){
            return 1 + leftDep + rightDep;
        }
        return 1 + Math.min(leftDep, rightDep);
    }
    public int minDepth(TreeNode root) {
        return solve(root);
    }
}
