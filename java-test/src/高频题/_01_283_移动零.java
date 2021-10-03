package 高频题;

public class _01_283_移动零 {
    public void moveZeroes(int[] nums) {
        int zeroIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 0){
                continue;
            }
            //交换
            int tmp = num;
            nums[i] = nums[zeroIdx];
            nums[zeroIdx] = num;
            zeroIdx ++;
        }
    }
}
