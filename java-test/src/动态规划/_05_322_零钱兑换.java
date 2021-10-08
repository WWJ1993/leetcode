package 动态规划;

public class _05_322_零钱兑换 {
    public int coinChange(int[] coins, int amount) {
        int[]dp = new int[amount+1];
        dp[0] = -1;
        System.out.print(dp[amount]);
        for (int i = 1; i <= amount ; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                int coin = coins[j];
                if (coin<=i){
                    dp[i] = Math.min(dp[i-coin]+1,dp[i]);
                }
            }
        }

        return dp[amount]>amount?-1:dp[amount];
    }

}
