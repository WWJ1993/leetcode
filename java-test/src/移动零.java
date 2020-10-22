public class 移动零 {
    public static void moveZeroes(int[] nums) {
        int cur = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] == 0){
                continue;
            }
            //交换
            int tmp = nums[cur];
            nums[cur] = nums[i];
            nums[i] = tmp;
            cur ++;
        }

    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 4,1,3,0,0,1,2};
        moveZeroes(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);

        }
    }
}
