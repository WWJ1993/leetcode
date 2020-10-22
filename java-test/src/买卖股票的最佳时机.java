public class 买卖股票的最佳时机 {

    //动态规划
    static public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;

        int minPrice = prices[0];
        int dp[] = new int[prices.length];

        for (int i = 1;i<prices.length;i++) {
            if (prices[i]<minPrice){
                minPrice = prices[i];
            }

             dp[i] = Math.max(dp[i-1],prices[i] - minPrice) ;
        }
        return dp[prices.length-1];
    }

    static public int maxProfit1(int[] prices) {
        if(prices.length == 0) return 0;

        int maxPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1;i<prices.length;i++){
            if (prices[i] < maxPrice ){
                maxPrice = prices[i];
            }else {
                if (prices[i] - maxPrice>maxProfit){
                    maxProfit = prices[i] - maxPrice;
                }
            }
//            maxProfit = Math.max(prices[i] - maxPrice,maxProfit) ;
//            maxPrice = Math.min(prices[i],maxPrice);
        }


        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,4,3,6,8}));
    }


}
