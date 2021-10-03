package 二叉树;

import com.sun.source.tree.Tree;

public class _02_99_恢复二叉搜索树 {


    TreeNode preNode;
    TreeNode firstNode;
    TreeNode secondNode;

    //morris
    public void recoverTree(TreeNode root) {
        //
        TreeNode curNode = root;
        while (curNode != null){
            if (curNode.left != null){
                //查找前驱节点
                TreeNode predNode = curNode.left;
                while (predNode.right != null && predNode.right != curNode){
                    predNode = predNode.right;
                }
                if (predNode.right == null){
                    predNode.right = curNode;
                    curNode=curNode.left;
                }else if(predNode.right == curNode){
//                    System.out.print(curNode.val);
                    findErrorNode(curNode);
                    predNode.right = null;
                    curNode=curNode.right;
                }
            }else {
//                System.out.print(curNode.val);
                findErrorNode(curNode);
                //打印当前节点
                curNode = curNode.right;
            }
        }

    }


    public void recoverTree1(TreeNode root) {
        findErrorNode(root);
        TreeNode tmp = firstNode;
        firstNode = secondNode;
        secondNode = tmp;

    }
    private void findErrorNode(TreeNode node){
        if (node == null) return;
        findErrorNode(node.left);
        if (preNode != null && preNode.val>node.val){//逆序对
            secondNode = node;
            if (firstNode != null) return;
            firstNode = preNode;
        }
        preNode = node;
        findErrorNode(node.right);
    }

    public static void main(String[] args) {
        (new _02_99_恢复二叉搜索树()).recoverTree(new TreeNode(1,new TreeNode(3,null,new TreeNode(2)),null));
    }
}
