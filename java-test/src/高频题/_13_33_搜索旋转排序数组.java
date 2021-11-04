package 高频题;

public class _13_33_搜索旋转排序数组 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left  = 0;
        int right = nums.length-1;
        int first = nums[0];
        int last = nums[nums.length-1];
        if (first == target) return 0;
        if (last == target) return nums.length-1;

        while (left<=right){
            int mid = (left+right)>>1;
            if (nums[mid] == target) return mid;
                if (nums[mid]>=first){
                    if (nums[mid]>target && target >= first){
                        right = mid - 1;
                    }else {
                        left = mid+1;
                    }
                }else {
                    if (nums[mid]<target && target < last){
                        left = mid + 1;
                    }else {
                        right = mid - 1;
                    }
                }


        }
        return -1;
    }

    public static void main(String[] args) {
        (new _13_33_搜索旋转排序数组()).search(new int[]{4,5,6,7,0,1,2} ,0);
    }
}
