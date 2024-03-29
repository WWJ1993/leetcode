package 动态规划;

public class _07_300_最长递增子序列 {
    public int lengthOfLIS(int[] nums) {
        int max = 0;
        int[] dp =  new  int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            max = Math.max(max,dp[i]);
        }
        return max;

    }

    public static void main(String[] args) {
        int a =  (new _07_300_最长递增子序列()).lengthOfLIS(new int[]{10,9,2,5,3,7,101,18});
        System.out.print(a);
    }
}
