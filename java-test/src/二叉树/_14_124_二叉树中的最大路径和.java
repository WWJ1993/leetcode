package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class _14_124_二叉树中的最大路径和 {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }
    int dfs(TreeNode root){
        List<Integer> list = new ArrayList<Integer>();

        if (root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int num = left + root.val + right;
        max = Math.max(num,max);
        return num;
    }
}
