public class 在排序数组中查找元素的第一个和最后一个位置 {

    public static int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) return new int []{-1,-1};
        //

        int mid = nums.length / 2;


        int left = searchRange(nums,target,true);

//        if (left == -1) return new int []{-1,-1};

//        System.out.println("-------");

        int right = searchRange(nums,target,false);


        return new int []{left,right};
    }
    public static int searchRange(int[] nums, int target, Boolean isStar) {
        //
        if (nums.length == 0) return  -1;

//        int mid = nums.length>>1;
//        int midTarget = nums[mid];

//        if (midTarget>target){
//            searchRange(nums,target,star,mid);
//        }else {
//            searchRange(nums,target,mid,end);
//        }
        int left = 0;
        int right = nums.length-1;
        int targetIdx = -1;
        while (left <= right){
            int mid = (left + right) / 2;

            if (nums[mid]>target) {
                right = mid - 1;
            }else  if (nums[mid] == target) {
                if (isStar) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                targetIdx = mid;
            }else {
                left = mid+1;
            }
//            System.out.println("mid:"+Integer.toString(mid)+",left:"+Integer.toString(left)+",right:"+Integer.toString(right));
        }



        return  targetIdx;
    }

    public static void main(String[] args) {


        int[] nums = searchRange(new int[]{1,6,6,8,8,9},6);
        System.out.println("-----");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }



}
