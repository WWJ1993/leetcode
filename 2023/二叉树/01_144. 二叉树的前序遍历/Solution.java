import java.util.Stack;

import 二叉树.TreeNode;

public class Solution {
    // 递归
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        this.subTraversal(root, list);
        return list;
    }

    public void subTraversal(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        list.add(root.val);
        this.subTraversal(root.left, list);
        this.subTraversal(root.right, list);
    }

    // 迭代
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        // 栈
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (stack.empty() == false || node != null) {
            while (node != null) {
                list.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            list.add(node.val);
        }

        return list;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        // 栈
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (stack.empty() == false || node != null) {
            if (node != null) {
                list.add(node.val);
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                node = node.right;
            }
        }

        return list;
    }

}
