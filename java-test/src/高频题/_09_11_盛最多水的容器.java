package 高频题;public class _09_11_盛最多水的容器 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while (left<right){
            int leftHeight = height[left];
            int rightHeight = height[left];
            int minHeight = 0;
            if (leftHeight < rightHeight){
                minHeight = leftHeight;
                left++;
            }else {
                minHeight = rightHeight;
                right--;
            }
            maxArea = Math.max(maxArea,minHeight*(right-left));
        }
        return maxArea;
    }
}
