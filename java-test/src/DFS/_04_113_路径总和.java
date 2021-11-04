package DFS;


import java.util.ArrayList;
import java.util.List;

public class _04_113_路径总和 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(root,targetSum,0,new ArrayList<>(),list);
        return  list;
    }
    public void dfs(TreeNode root,int targetSum, int sum,List<Integer> subList,List<List<Integer>> list){
        if (root.left == null && root.right == null){
            if (sum == targetSum) list.add(subList);
            return;
        }

        sum += root.val;
        subList.add(root.val);
        if (root.left != null){
            dfs(root.left,targetSum,sum,subList,list);
        }
        if (root.right != null){
            dfs(root.right,targetSum,sum,subList,list);
        }
        subList.remove(subList.size()-1);
    }
}



class TreeNode {
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
