package 动态规划;

public class _06_53_最大子序和 {
    public int maxSubArray(int[] nums) {
        if (nums == null) return 0;
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            max = Math.max(dp[i],max);
        }
        return max;
    }

    public static void main(String[] args) {
        int a = (new _06_53_最大子序和()).maxSubArray(new int[]{-2,1,5,4});
        System.out.print(a);
    }
}
