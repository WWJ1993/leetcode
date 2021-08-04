/**
 * 75. 颜色分类
 * 荷兰国旗问题🇳🇱
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 * 示例 2：
 *
 * 输入：nums = [2,0,1]
 * 输出：[0,1,2]
 * 示例 3：
 *
 * 输入：nums = [0]
 * 输出：[0]
 * 示例 4：
 *
 * 输入：nums = [1]
 * 输出：[1]
 *
 *
 *
 * 空间复杂度O(1)
 * 时间复杂度O(n)
 * */
public class _02颜色分类 {

    public void sortColors(int[] nums) {
//        思路：要求扫描一遍：双指针

        int p0 = 0;
        int p1 = 0;
        int p2 = nums.length-1;
        while (p1<=p2){
            if (nums[p1] == 0){
                int tmp = nums[p1];
                nums[p1] = nums[p0];
                nums[p0] = tmp;

                p0++;
                p1++;
            }else if (nums[p1] == 1){
                p1++;
            }else if (nums[p1] == 2){
                int tmp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = tmp;
                p2--;
            }
        }

//        int left = 0;
//        int right = nums.length-1;
//        while (left<right){
//            System.out.println("left:"+left +",right:"+right+",nums[left]"+nums[left]+",nums[right]"+nums[right]);
//            if (nums[left]>nums[right]){
//                int tmp = nums[left];
//                nums[left] = nums[right];
//                nums[right] = tmp;
//                right --;
//            }else {
//                int tmp = nums[left];
//                nums[left] = nums[right];
//                nums[right] = tmp;
//                left ++;
//            }
//        }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        _02颜色分类 a = new _02颜色分类();
        a.sortColors(nums);

        System.out.println("--------------");
        for (int item: nums) {
            System.out.println(item);
        }

    }
}
