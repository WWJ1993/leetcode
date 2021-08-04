package 排序;

public class _01冒泡 {
    public void sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            boolean isSort = true;
            for (int j = nums.length-1; j >i ; j--) {
                int item1 = nums[j-1];
                int item2 = nums[j];
                if (item2<item1){
                    int tmp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = tmp;
                    isSort = false;
                }
            }
            if (isSort) break;
        }
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{3,1,51,4,6,3,65,7,36,63};
        int[] nums = new int[]{5,3,2,1};

        _01冒泡 a = new  _01冒泡();
        a.sort(nums);
        for (int item:nums) {
            System.out.println(item);
        }

    }

}
