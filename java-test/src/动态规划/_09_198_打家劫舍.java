package 动态规划;

public class _09_198_打家劫舍 {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]) ;
        }
        return dp[nums.length-1];
    }
    public int rob1(int[] nums) {
        if (nums.length == 1) return nums[0];
        int pre = nums[0];
        int max = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int tmp = max;
            max = Math.max(pre + nums[i],max);
            pre = tmp;
        }
        return max;
    }
}
