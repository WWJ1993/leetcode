package 排序;
import 排序.*;

public class main {
//    private static _01冒泡 cls = new _01冒泡();
//    private static _02选择排序 cls = new _02选择排序();
    private static  _03插入排序 cls = new _03插入排序();
    public static void main(String[] args) {
        int[] nums = new int[]{3,1,51,4,6,3,65,7,36,63};
//        int[] nums = new int[]{5,2,3,1};
//        int[] nums = new int[]{3,1};

        cls.sort(nums);
        for (int item:nums) {
            System.out.println(item);
        }
    }
}

