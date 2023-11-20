public class Solution {
    public int[][] generateMatrix(int n) {
        int left = 0;
        int right = n;
        int top = 0;
        int bottom = n;
        int cur = 1;
        int[][] nums = new int[n][n];
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                nums[top][i] = cur;
                cur++;
            }
            top++;
            if (top > bottom) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                nums[i][right] = cur;
                cur++;
            }
            right--;
            if (left > right) {
                break;
            }
            for (int i = right; i >= left; i--) {
                nums[bottom][i] = cur;
                cur++;
            }
            bottom--;
            if (top > bottom) {
                break;
            }
            for (int i = bottom; i >= top; i--) {
                nums[i][left] = cur;
                cur++;
            }
            left++;
        }

        return nums;

    }
}
