package 数组;

public class _11_162_寻找峰值 {
    public int findPeakElement(int[] nums) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0];
        int left = 0;
        int right = nums.length-1;

        while (left<right){
            int mid = (right+left) >> 1;
            if (nums[mid]>nums[mid+1]){
                if (nums[mid]>nums[mid-1]) return mid;
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return nums[left];

    }


    public static void main(String[] args) {
        int[] a = {1,2,3,1};

        System.out.print( (new _11_162_寻找峰值()).findPeakElement(a)+"\n");

    }
}
