package 动态规划;

public class _02_121买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
//        if (prices.length<2) return 0;
        int[] dp = new int[prices.length];
//        dp[0] = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<min){
                min = prices[i];
            }
            dp[i] = Math.max(dp[i-1], prices[i]-min) ;
        }

        return dp[prices.length-1];
    }
}
