package DFS;

import java.util.ArrayList;
import java.util.List;

public class _03_22_括号生成 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        if (n < 0) return list;
        if (n == 0){
            list.add("");
            return list;
        }
        dfs(0,list,new char[n*2],n,n);
        return list;
    }
    public void dfs(int depth, List<String> list, char[] chars, int leftNum, int rightNum){
        if (depth == chars.length){
            list.add(new String(chars));
            return;
        }

        //左括号
        if (leftNum>0){
            chars[depth] = '(';
            dfs(depth+1,list,chars,leftNum-1,rightNum);
        }
        //右括号
        if (rightNum>0 && leftNum != rightNum){
            chars[depth] = ')';
            dfs(depth+1,list,chars,leftNum,rightNum-1);
        }

    }
}
