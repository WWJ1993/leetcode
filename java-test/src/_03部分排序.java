/**
 * 面试题 16.16. 部分排序
 * https://leetcode-cn.com/problems/sub-sort-lcci/
 * 给定一个整数数组，编写一个函数，找出索引m和n，只要将索引区间[m,n]的元素排好序，整个数组就是有序的。注意：n-m尽量最小，也就是说，找出符合条件的最短序列。函数返回值为[m,n]，若不存在这样的m和n（例如整个数组是有序的），请返回[-1,-1]。
 *
 * 示例：
 *
 * 输入： [1,2,4,7,10,11,7,12,6,7,16,18,19]
 * 输出： [3,9]
 * 提示：
 *
 * 0 <= len(array) <= 1000000
 *
 *
 * */

public class _03部分排序 {
    //寻找逆序对
    //从左到右，当前位置小于最大值
    //从右到左，当前位置大于最小值

    public int[] subSort(int[] array) {
        if (array.length == 0) return new int[]{-1,-1};
        int maxIdx = -1,minIdx = -1;
        int max = array[0] ,min = array[array.length-1] ;
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            if (item>=max){
                max = item;
            }else{
                maxIdx = i;
            }
        }
        if(maxIdx == -1){
            return new int[]{-1,-1};
        }

        for (int i = array.length-1; i >=0 ; i--) {
            int item = array[i];
            if (item<=min){
                min = item;
            }else{
                minIdx = i;
            }
        }

        return new int[]{ minIdx,maxIdx};

    }

    public static void main(String[] args) {
        _03部分排序 a =  new _03部分排序();
        int[] c = new int[]{1,3,9,7,5};
        int[] b = a.subSort(new int[]{1,3,9,7,5});
        for (int i = 0; i < b.length; i++) {
            int item = b[i];
            System.out.println(c[item]+ ",idx："+item);
        }
    }
}
