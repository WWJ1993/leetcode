class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m - 1;
        int i2 = n - 1;
        int cur = nums1.length - 1;
        while (i2 >= 0) {
            int num1 = nums1[i1];
            int num2 = nums2[i2];
            if (i1 >= 0 && num1 > num2) {
                nums1[cur] = num1;
                i1--;
            } else {
                nums1[cur] = num2;
                i2--;
            }
            cur--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;

        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        for (int item : nums1) {
            System.out.println(item);
        }
    }
}
