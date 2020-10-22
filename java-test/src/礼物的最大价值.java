public class 礼物的最大价值 {
    static public int maxValue(int[][] grid) {
        if (grid.length == 0)   return 0;
        if (grid[0].length == 0) return 0;
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            dp[i][0] = grid[i][0]+dp[i-1][0];
            System.out.println("i="+i+",j=0"+",dp[i][j] = "+dp[i][0]);
        }
        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = grid[0][i]+dp[0][i-1];
            System.out.println("i=0"+",j="+i+",dp[i][j] = "+dp[0][i]);
        }

        for (int i = 1; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length; j++) {

                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+grid[i][j];
                System.out.println("i="+i+",j="+j+",dp[i][j] = "+dp[i][j]);
            }
        }

        return dp[grid.length-1][grid[0].length-1];
    }

    public static void main(String[] args) {

        int max =  maxValue(new int[][]{{1,3,1},
                {1,5,1}});
        System.out.println(max);
    }
}
