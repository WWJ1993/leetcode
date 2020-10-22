import java.util.ArrayList;
import java.util.List;

public class 括号生成 {

    static public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();
        if (n<0) return  list;
        if (n==0) {
            list.add("");
            return list;
        }
    dfs(0,n,n,new char[n<<1],list);
        return list;
    }
    /*搜索层号*/
    static private void dfs(int idx,int leftRemain,int rightRemain,char[]string,List list){
        if (idx == string.length){
            list.add(new String(string));
            return;
        }
        //枚举这层所有可能的选择
        //选择一种可能之后，进入下一层搜索
        //什么情况可以选择左括号？左括号数量>0
        if (leftRemain>0){
            string[idx] = '(';
            dfs(idx+1,leftRemain-1,rightRemain,string,list);
        }
        //什么情况可以选择右括号？右括号数量>0 && 左括号数量 ！= 右括号数量
        //选择右括号，进入下一层
        if (rightRemain>0&&leftRemain != rightRemain ){
            string[idx] = ')';
            dfs(idx+1,leftRemain,rightRemain-1,string,list);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
