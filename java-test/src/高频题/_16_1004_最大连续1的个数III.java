package 高频题;

public class _16_1004_最大连续1的个数III {
    public int longestOnes(int[] nums, int k) {
        if (nums.length == 0) return 0;
        int max = 0;
        int n = nums.length;
        int[] P = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            P[i] = P[i - 1] + (1 - nums[i - 1]);
        }

        for (int i = 0; i<nums.length; i++){
            int left = binarySearch(P,P[i+1] - k);
            max = Math.max(max,(i-left)+1);
        }
        return max;
    }
    public int binarySearch(int[] P,int target){
        int left = 0;
        int right = P.length-1;
        while(left<right){
            System.out.println(left+"_"+right);
            int mid = left + (right-left)/2;
            if(P[mid]  < target){
                left = mid;
            }else{
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        (new _16_1004_最大连续1的个数III()).longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2);
    }
}
