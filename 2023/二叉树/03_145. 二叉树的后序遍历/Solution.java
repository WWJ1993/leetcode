import java.util.ArrayList;
import java.util.Stack;

import 二叉树.TreeNode;

public class Solution {
    // 递归
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        this.subTraversal(root, list);
        return list;
    }

    public void subTraversal(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        this.subTraversal(root.left, list);
        this.subTraversal(root.right, list);
        list.add(root.val);
    }

    // 迭代
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        TreeNode pre = null;
        while (stack.empty() == false || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            if (node.right == null || node.right == pre) {
                list.add(node.val);
                pre = node;
                node = null;
            } else {
                stack.push(node);
                node = node.right;
            }
        }
        return list;
    }

}
