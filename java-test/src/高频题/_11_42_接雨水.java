package 高频题;

public class _11_42_接雨水 {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxHeight = 0;
        int water = 0;
        while (left<right){
            int leftHeight = height[left];
            int rightHeight = height[right];
            int minHeight = Math.min(leftHeight,rightHeight);
            if (leftHeight>rightHeight){
                right--;
            }else {
                left++;
            }
            maxHeight = Math.max(maxHeight,minHeight);
            water = water+maxHeight-minHeight;
        }
        return water;
    }
}
