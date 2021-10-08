package 动态规划;

public class _12_55_跳跃游戏 {
    public boolean canJump(int[] nums) {
        int max = 0;    //最大可跳跃位置
        for (int i = 0; i < nums.length; i++) {
            if (i>max){
                return false;
            }
            max = Math.max(max,i+nums[i]);
        }
        return true;
    }
}
