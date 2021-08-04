
/*
* 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。

初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。

 

示例 1：

输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
输出：[1,2,2,3,5,6]
示例 2：

输入：nums1 = [1], m = 1, nums2 = [], n = 0
输出：[1]


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/merge-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*
* */

public class _01合并两个有序数组 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m-1;
        int i2 = n-1;
        int cur = nums1.length-1;
        while (i2>=0){
            if (i1>=0 && nums1[i1]>nums2[i2]){
                nums1[cur] = nums1[i1];
                i1--;
            }else {
                nums1[cur] = nums2[i2];
                i2--;
            }
            cur --;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{6};
        int m = 1;
        int n = 1;
        _01合并两个有序数组 a = new _01合并两个有序数组();
        a.merge(nums1,m,nums2,n);
        for (int item: nums1) {
            System.out.println(item);
        }
//this.merge(nums1,m,nums2,n);

    }
}
