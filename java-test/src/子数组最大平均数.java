public class 子数组最大平均数 {
    //滑动窗口
    public  static double findMaxAverage(int[] nums, int k) {
        if (nums.length<k) return 0;
        //求0-k的和
        double sum = 0;
        for (int i = 0;i<k;i++){
            sum += nums[i];
        }
        //向右滑动到nums.length
        double sumMax = sum;
        for (int i = k;i<nums.length;i++){
            sum = sum -nums[i-k]+nums[i];
            sumMax = Math.max(sum,sumMax);
        }
       return sumMax/k;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,12,-5,-6,50,3};
        double sumMax =  findMaxAverage(nums,4);
        System.out.println(sumMax);
    }

}


