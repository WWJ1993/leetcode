package 动态规划;

public class _04_72_编辑距离 {
    public int minDistance(String word1, String word2) {
        char[] s1 = word1.toCharArray();
        char[] s2 = word2.toCharArray();

        if (s1.length == 0) return s2.length;
        if (s2.length == 0) return s1.length;

        int[][] dp = new int[s1.length+1][s2.length+1];

        dp[0][0] = 0;
        for (int i = 1; i <= s1.length; i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i <= s2.length; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= s1.length; i++) {
            char char1 = s1[i-1];
            for (int j = 1; j <= s2.length; j++) {
                char char2 = s2[j-1];
                int left = dp[i-1][j]+1;
                int top = dp[i][j-1]+1;
                int leftTop = dp[i-1][j-1];
                if (char1 != char2){
                    leftTop = leftTop+1;
                }
                dp[i][j] = Math.min(left,Math.min(top,leftTop));
            }
        }

        return dp[s1.length][s2.length];
    }
}
