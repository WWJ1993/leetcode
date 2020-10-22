
public class 颜色分类 {
    static  public void sortColors1(int[] nums) {
        int p0 = 0; //0
        int p1 = 0; //1
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0){
                int tmp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = tmp;
                if (p0<p1){
                    tmp = nums[i];
                    nums[i] = nums[p1];
                    nums[p1] = tmp;
                }
                p0++;
                p1++;
            }else if (nums[i] == 1){
                int tmp = nums[i];
                nums[i] = nums[p1];
                nums[p1] = tmp;
                p1++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }
    static  public void sortColors(int[] nums) {
        int p0 = 0; //0
        int p1 = 0; //1
        int p2 = nums.length-1; //2
        while (p1<=p2) {
            if (nums[p1] == 0) {
                int tmp = nums[p1];
                nums[p1] = nums[p0];
                nums[p0] = tmp;
                p0++;
                p1++;
            }else if (nums[p1] == 1){
                p1++;
            }else {
                int tmp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = tmp;
                p2--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }

    public static void main(String[] args) {

        sortColors(new int[]{2,1,0,1,0});

    }
}
