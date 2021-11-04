package 排序;

public class _A_912_排序数组 {
    //冒泡
    public int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > i; j--) {
                int num1 = nums[j-1];
                int num2 = nums[j];
                if (num1>num2){
                    nums[j-1] = num2;
                    nums[j] = num1;
                }
            }
        }
        return nums;
    }
}
