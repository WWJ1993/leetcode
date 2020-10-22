public class 分割等和子集 {
    static public boolean canPartition(int[] nums) {
        if (nums.length<2) return false;
        int sum = 0, maxNum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (nums[i]>maxNum) maxNum = nums[i];
        }
        if ((sum&1) == 1) return false;     //奇数
        int target = sum >> 1;
        if (maxNum>target) return false;



        Boolean[][] dp = new Boolean[nums.length][target+1];
        for (int i = 0; i < nums.length; i++) {
            dp[i][0] = true;
        }

        for (int j = 0; j < target+1; j++) {
            dp[0][j] = nums[0] == j;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < target+1; j++) {
                if (j>= nums[i]){
                    dp[i][j] = dp[i-1][j-nums[i]]|dp[i-1][j];
                }else {
                    dp[i][j] = dp[i-1][j];
                }
                System.out.println("i="+i + ",j="+j+dp[i][j]);
            }
        }
        return dp[nums.length-1][target];
    }

    public static void main(String[] args) {

        System.out.println(canPartition(new int[]{2,2,3,5}));
    }
}
