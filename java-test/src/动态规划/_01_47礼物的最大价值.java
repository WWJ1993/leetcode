package 动态规划;
//https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/submissions/
public class _01_47礼物的最大价值 {
    public int maxValue(int[][] grid) {
        if (grid.length == 0)   return 0;
        if (grid[0].length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]) + grid[i][j];
            }
        }
        return dp[rows-1][cols-1];
    }
}
