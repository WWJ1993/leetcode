import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int all = nums[i] + nums[l] + nums[r];
                if (all > 0) {
                    r--;
                } else if (all < 0) {
                    l++;
                } else {
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    l++;
                    r--;
                }
            }
        }
        return list;

    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.threeSum(new int[] { -1, 0, 0 }));

    }
}
