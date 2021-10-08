package 高频题;

public class _04_746_使用最小花费爬楼梯 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 1; i<cost.length; i++){
            dp[i] = Math.min(cost[i-1],cost[i-2])+ Math.min(dp[i-1],dp[i-2]);
        }
        return dp[cost.length-1];
    }
}
