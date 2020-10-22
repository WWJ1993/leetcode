import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和 {
    public static List<List<Integer>> threeSum(int[] nums) {

        if (nums == null) return null;
        //排序
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        if (nums.length<3) return list;
        for (int i = 0;i<=nums.length-3 ;i++){
            if (i>0&&nums[i]==nums[i-1] ) continue;
            int l = i+1;
            int r = nums.length-1;
            while (l < r){
                int a = nums[i]+nums[l]+nums[r];
                if (a>0){
                    r--;
                }else if (a<0){
                    l++;
                }else {
                    list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l<r && nums[l] == nums[l+1]) l++;
                    while (l<r && nums[r] == nums[r-1]) r--;
                    l++;
                    r--;
                }
            }

        }
        return list;
    }

    public static void main(String[] args) {

        System.out.println(threeSum(new int[]{0,0,0}));
    }
}
