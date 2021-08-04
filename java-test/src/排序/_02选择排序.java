package 排序;
//从数组中找到最大的元素，与最后的元素进行交换

public class _02选择排序 {
    public void sort (int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j]>nums[i]){
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] =  tmp;
                }
            }
        }
    }
}
