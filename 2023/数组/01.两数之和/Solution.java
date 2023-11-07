import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { (int) map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        for (int item : new Solution().twoSum(nums, 9)) {
            System.out.println(item);
        }
    }
}
