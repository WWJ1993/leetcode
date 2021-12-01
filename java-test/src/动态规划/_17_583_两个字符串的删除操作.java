package 动态规划;

public class _17_583_两个字符串的删除操作 {
    public int minDistance(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        int[][] dp = new int[chars1.length+1][chars2.length+1];
        dp[0][0] = 0;
        for (int i = 0; i <= chars1.length; i++) dp[i][0] = dp[i-1][0]+1;
        for (int i = 0; i <= chars2.length; i++) dp[0][i] = dp[0][i-1]+1;
        for (int i = 1; i <= chars1.length; i++) {
            for (int j = 1; j <= chars2.length; j++) {
                if (chars1[i] == chars2[j]){
                    dp[i][j] = dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+1;
                }
            }
        }
        return dp[chars1.length][chars2.length];
    }
}
