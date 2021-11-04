package 动态规划;

public class _16_122_买卖股票的最佳时机II {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int pre = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]>pre){
                sum += prices[i]-pre;
                pre = prices[i];
            }
            pre = Math.min(pre,prices[i]);
        }
        return sum;
    }
}
