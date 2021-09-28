/*
* 977. 有序数组的平方
* 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。

 

示例 1：

输入：nums = [-4,-1,0,3,10]
输出：[0,1,9,16,100]
解释：平方后，数组变为 [16,1,0,9,100]
排序后，数组变为 [0,1,9,16,100]
示例 2：

输入：nums = [-7,-3,2,3,11]
输出：[4,9,9,49,121]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* https://leetcode-cn.com/problems/squares-of-a-sorted-array/
* */


public class _05有序数组的平方 {

    /*
    * 思路：nums已排序，找到负数与正数的分界线，归并排序
    * */
    public int[] sortedSquares(int[] nums) {

        //找分界线
        int negative = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0){
                negative = i;
            }else {
                break;
            }
        }
//
////        合并两个有序数组
        int l = negative;
        int r = negative+1;
        int[] new_nums = new int[nums.length];
        while (r-l-1<nums.length){
            if (l<0) {
                new_nums[r-l-1] = nums[r]*nums[r];
                r++;
                continue;
            }
            if (r>nums.length-1){
                new_nums[r-l-1] = nums[l]*nums[l];
                l--;
                continue;
            }
            int item1 =  nums[l]*nums[l];
            int item2 =  nums[r]*nums[r];
            if (item1<item2){
                new_nums[r-l-1] = item1;
                 l--;
            }else {
                new_nums[r-l-1] = item2;
                r++;
            }
        }
        return new_nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-4,-1,0,3,10};
        _05有序数组的平方 a = new _05有序数组的平方();
        int[] new_nums =  a.sortedSquares(nums);
        for (int i = 0; i < new_nums.length; i++) {
            int item = new_nums[i];
            System.out.println(item + ",idx："+item);
        }

    }
}
