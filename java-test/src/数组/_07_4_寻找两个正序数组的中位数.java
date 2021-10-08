package 数组;

public class _07_4_寻找两个正序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length+nums2.length;
        int mid = length >> 1;
        int cur = 0;
        int cur1 = 0;
        int cur2 = 0;
        int[] nums = new  int[mid+1];
        while (mid>=cur) {

            if (nums1[cur1]<nums2[cur2]){
                nums[cur] = nums1[cur1];
                if (cur1< nums1.length-1){
                    cur1++;
                }else {
                    cur2++;
                }
            }else {
                nums[cur] = nums1[cur2];
                if (cur2< nums2.length-1){
                    cur2++;
                }else {
                    cur1++;
                }
            }
            cur++;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[0]);
        }

        return  (mid&1) == 1? nums[mid] : (nums[mid]+nums[mid-1])*0.5;


    }
}
