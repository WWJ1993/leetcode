package 动态规划;

public class _08_1143_最长公共子序列 {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];

        char[] char1 = text1.toCharArray();
        char[] char2 = text2.toCharArray();

        for (int i = 0; i < char1.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < char2.length; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= char1.length; i++) {
            for (int j = 1; j <= char2.length; j++) {
                int left = dp[i-1][j];
                int top = dp[i][j-1];
                int leftTop = dp[i-1][j-1];
                if ( char1[i-1]==char2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
//                int max = Math.max(left,Math.min(top,leftTop));
//                dp[i][j] = char1[i]==char2[j]?max+1:max;
            }
        }
        return dp[char1.length][char2.length];
    }
}
