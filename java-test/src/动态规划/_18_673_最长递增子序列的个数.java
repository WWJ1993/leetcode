package 动态规划;

public class _18_673_最长递增子序列的个数 {
    public int findNumberOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int[] cnt = new int[nums.length];
        int maxLen = 0;
        int ant = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            cnt[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i]>nums[j]){ //递增
                    if (dp[i]<dp[j]+1){
                        dp[i] = dp[j]+1;
                        cnt[i] = cnt[j];
                    }else if(dp[i]==dp[j]+1) {
                        cnt[i] = cnt[i] + cnt[j];
                    }
                }
            }
            if (dp[i]>maxLen){
                maxLen = dp[i];
                ant = cnt[i];
            }else if(dp[i]==maxLen){
                ant = ant + cnt[i];
            }
        }
        return  ant;
    }
}
