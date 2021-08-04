package 排序;

public class _03插入排序 {

    public void sort1(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = tmp;
                } else {
                    break;
                }
            }
        }
    }
    //挪动
    public void sort2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int item = nums[i];
            int cur = i;
            while (cur>0){
                if (nums[cur-1] > item) {
                    nums[cur] = nums[cur-1];
                } else {
                    break;
                }
                cur --;
            }
            nums[cur] = item;
        }
    }
    public void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int item = nums[i];
            int index = getMin(nums,0,i,item);
            for (int j = i-1; j >= index; j--) {
                nums[j+1] = nums[j];

            }
            nums[index] = item;
            System.out.println("i:"+i +"index:"+index+",nums[index]:"+nums[index]);

        }
    }
        //二分查找
    public int getMin(int[] nums,int l,int r,int target){
        while (l<r){
            int min = (l+r)>>1;
            if (nums[min]>target) {
                r = min;
            }else if (nums[min]<target)  {
                l = min+1;
            }else {
                return min;
            }

        }


        return l;
    }
//    优化 改为挪动


    public static void main(String[] args) {
        int[] nums = new int[]{3,1,51,4,6,3,65,7,36,63};
//        int[] nums = new int[]{3,1,1};

           _03插入排序 cls = new _03插入排序();
        cls.sort(nums);
        for (int item:nums) {
            System.out.println(item);
        }
    }
}

