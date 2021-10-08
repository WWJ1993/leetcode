package 数组;

public class _08_704_二分查找 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start<end){
            int mid = (start+end)>>1;
            int num =  nums[mid];
            if (target>num){
                start = mid+1;
            }else if (target<num){
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;

    }


}
