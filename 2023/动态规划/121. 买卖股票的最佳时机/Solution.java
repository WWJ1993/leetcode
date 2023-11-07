public class Solution {
    public int maxProfit1(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int max = 0; // 记录最大利润
        int min = 0; // 记录当日前的最小价格
        for (int i = 0; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }

}
