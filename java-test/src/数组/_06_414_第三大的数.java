package 数组;

public class _06_414_第三大的数 {
    public int thirdMax(int[] nums) {

        long num1 = Long.MIN_VALUE;
        long num2 = Integer.MIN_VALUE;
        long num3 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num>num1){
                num3 = num2;
                num2 = num1;
                num1 = num;
                continue;
            }
            if (num>num2){
                num3 = num2;
                num2 = num;
                continue;
            }
            if (num>num3){
                num3 = num;
            }

        }
        if (num3 == Integer.MIN_VALUE){
            return (int)num1;
        }
        return (int)num3;
    }
}
