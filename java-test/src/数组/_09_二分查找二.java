package 数组;

public class _09_二分查找二 {

    public int search (int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            System.out.print(nums[mid]+"."+mid+"."+left+"."+right+".\n");
            if(nums[mid]==target){
                index = mid;
                while (mid>=0&&nums[mid] == target) {
                    index = mid;
                    mid --;
                };
                break;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        System.out.println((new _09_二分查找二()).search(new int[]{0,1,1,5,7,10,22},1));
    }
}
