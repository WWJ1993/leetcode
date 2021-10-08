package 动态规划;

public class _13_45跳跃游戏II {
    //最少跳跃次数

    public int jump(int[] nums) {
        int maxIdx = 0;
        int end = 0;
        int step = 0;
        for (int i = 0; i < nums.length-1; i++) {
            maxIdx = Math.max(maxIdx,nums[i]+i);
            if (end == i){
                end = maxIdx;
                step ++;
            }
        }
        return  step;

    }
}
