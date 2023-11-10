import java.util.ArrayList;
import java.util.Stack;

import 二叉树.TreeNode;

public class Solution {
    // 递归
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        this.subTraversal(root, list);
        return list;
    }

    public void subTraversal(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        this.subTraversal(root.left, list);
        list.add(root.val);
        this.subTraversal(root.right, list);
    }

    // 迭代
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack();
        TreeNode node = root;
        while (stack.empty() == false || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            list.add(node.val);
            node = node.right;
        }
        return list;
    }

}
