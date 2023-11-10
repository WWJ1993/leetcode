public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(0, nums, list);
        return list;

    }

    public void dfs(int idx, int[] nums, List<List<Integer>> list) {
        if (idx == nums.length) {
            List<Integer> result = new ArrayList<>();
            for (int i : nums) {
                result.add(i);
            }
            list.add(result);
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            if (this.isRepeat(nums, idx, i))
                continue;
            swap(nums, i, idx);
            this.dfs(idx + 1, nums, list);
            swap(nums, i, idx); // 恢复现场
        }
    }

    boolean isRepeat(int[] nums, int idx, int i) {
        for (int j = idx + 1; j <= i; j++) {
            if (nums[idx] == nums[j])
                return true;
        }
        return false;
    }

    void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
