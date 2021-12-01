package 动态规划;

public class _08_1143_最长公共子序列 {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] chars1 = text1.toCharArray();
        char[] chars2 = text2.toCharArray();
        int[][] dp = new int[chars1.length+1][chars2.length+1];
        for (int i = 0; i <= chars1.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= chars1.length; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= chars1.length; i++) {
            for (int j = 1; j <= chars2.length; j++) {
                if (chars1[i-1] == chars2[j-1]){
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }
        return dp[chars1.length][chars2.length];
    }
}
