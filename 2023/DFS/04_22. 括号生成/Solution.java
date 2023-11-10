public class Solution {
    //
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        this.dfs(0, list, new char[n * 2], n, n);
        return list;
    }

    void dfs(int idx, List<String> list, char[] chars, int leftCount, int rightCount) {
        if (idx == chars.length) {
            list.add(new String(chars));
            return;
        }
        // 当左右括号数量一样时，只能选择做括号
        // 选左括号条件：左括号数量大于0
        // 选右括号条件：右括号数量大于0，且 左括号数量 != 右括号数量
        if (leftCount > 0) {
            chars[idx] = '(';
            this.dfs(idx + 1, list, chars, leftCount - 1, rightCount);
        }

        if (rightCount > 0 && leftCount != rightCount) {
            chars[idx] = ')';
            this.dfs(idx + 1, list, chars, leftCount, rightCount - 1);
        }

    }
}
