import java.util.HashMap;
import java.util.Map;

class Solution {
//    static public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i<nums.length; i++)
//        {
//            for (int j = i+1; j < nums.length; j++) {
//                if (target - nums[i] == nums[j]){
//                    return new int[]{i,j};
//                }
//            }
//        }
//
////        throw new IllegalArgumentException("No two sum solution");
//
//        throw new IllegalArgumentException("NO");
//    }


    static public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i <nums.length ; i++) {
            int com = target-nums[i];
            if (map.containsKey(com)&& map.get(com) != i){
                return new int[]{map.get(com),i};
            }
            map.put(nums[i],i);
        }

        throw new IllegalArgumentException("NO");
    }


    public static void main(String[] args) {
        int data[] = {1,4,3,16,7,2,0,6,3,9};
        int[] a = Solution.twoSum(data,9);
        for (int num:a){
            System.out.println(num+":"+data[num]);
        }
    }

}