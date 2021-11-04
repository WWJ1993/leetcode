package 高频题;

public class _12_4_寻找两个正序数组的中位数 {
    //合并两个有序数组
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = (nums1.length+nums2.length)/2;
        int idx1 = 0;
        int idx2 = 0;
        int preNum = 0;
        if (nums1.length == 0 )  return ((nums2.length&1) == 1)?nums2[length+1]:0.5*(nums2[length]+nums2[length+1]);
        if (nums2.length == 0 )  return ((nums1.length&1) == 1)?nums1[length+1]:0.5*(nums1[length]+nums1[length+1]);

        while ((idx1+idx2)<=length+1){
            if (idx1>=nums1.length){
                preNum = nums1[idx2];
                idx2++;
                continue;
            }
            if (idx2>=nums2.length){
                preNum = nums1[idx1];
                idx1++;
                continue;
            }
            if (nums1[idx1]<nums2[idx2]){
                preNum = nums1[idx1];
                idx1++;
            }else {
                preNum = nums2[idx2];
                idx2 ++;
            }
        }
        System.out.println("");
        int num = nums1[idx1]<nums2[idx2]?nums1[idx1]:nums2[idx2];
        return  ((nums1.length+nums2.length)%2 == 1)?num:(preNum+num)/2;
    }
}
