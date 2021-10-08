package 动态规划;

public class _10_213_打家劫舍II {
    //思路：偷头不偷尾，偷尾不偷头
    public int rob1(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0],nums[1]);

        int[] dp = new int[nums.length-1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length-1; i++) {
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        int max  = dp[nums.length-2];
        dp[0] = nums[1];
        dp[1] = Math.max(nums[1],nums[2]);
        for (int i = 2; i < nums.length-1; i++) {
            dp[i] = Math.max(dp[i-2]+nums[i+1],dp[i-1]);
        }
        return Math.max(max,dp[nums.length-2]);
    }

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        return Math.max(subRob(nums,0,nums.length-2),subRob(nums,1,nums.length-1));
    }
    public int subRob(int[]nums,int start,int end){
        int pre = nums[start];
        int max = Math.max(nums[start],nums[start+1]);
        for (int i = start+2; i <= end; i++) {
            int tmp = max;
            max = Math.max(pre + nums[i],max);
            pre = tmp;
        }
        return max;

    }

}
