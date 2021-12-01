package 高频题;

import java.util.*;

public class _19_前K个高频元素 {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = 1;
            if (map.containsKey(nums[i])){
                num = map.get(nums[i]);
            }
            map.put(nums[i],num);
        }
        PriorityQueue queue = new PriorityQueue();

        return res.stream().mapToInt(Integer::valueOf).toArray();
    }
}
