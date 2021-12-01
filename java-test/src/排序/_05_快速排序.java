package 排序;

public class _05_快速排序 {
    public int[] sortArray(int[] nums) {
        sortArray(nums,0,nums.length-1);
        return nums;
    }
    public int[] sortArray(int[] nums,int left ,int right) {
        if (left < right) {
            int idx = partition(nums,left,right);
            sortArray(nums,left,idx-1);
            sortArray(nums,idx+1,right);
        }
        return nums;
    }
    //都从左边开始
    public int partition1(int[] nums,int left ,int right){
        int pivot = left;
        int index = left+1;
        for (int i = left; i <= right; i++) {
            if (nums[i]<pivot){
                if (i != index) swap(nums,i,index);
                index ++;
            }
        }
        swap(nums,pivot,index-1);
        return index-1;
    }
    //从左右开始
    public int partition(int[] nums,int left ,int right){
        int index = left;
        left = left + 1;
        while (left<right){
            while (nums[index]<nums[right])right--;
            swap(nums,left,right);
            while (nums[index]>nums[left]) left++;
            swap(nums,left,right);
        }
        
        return left;
    }

    public void swap(int[] nums,int idx1 ,int idx2){
        int tmp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = tmp;
    }



}
