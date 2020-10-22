import com.sun.tools.javac.Main;

public class 接雨水 {



    static public int trap(int[]height){
        int left = 0 ,right = height.length-1,water = 0,lowerMax = 0;

        while (left < right){
            int lower = 0;
            if (height[left]<=height[right]){
                lower = height[left];
                left ++;
            }else {
                lower = height[right];
                right --;
            }
            lowerMax = Math.max(lowerMax,lower);
            water += lowerMax-lower;
        }
        return water;
    }


    static public int trap0(int[]height){
        if (height == null||height.length == 0) return  0;

        int lastIdx = height.length-2;
        int[] leftMaxes = new int[height.length];
//        leftMaxes[0] = height[0];
        for (int i = 1;i<=lastIdx; i++){
            leftMaxes[i] = Math.max(leftMaxes[i-1],height[i-1]);
        }

        int[] rightMaxes = new int[height.length];
//        rightMaxes[height.length-1] = height[height.length-1];

        for (int i = lastIdx;i>=1; i--){
            rightMaxes[i] = Math.max(rightMaxes[i+1],height[i+1]);
        }

        int water = 0;
        //遍历每一个柱子
        for (int i = 1;i<=lastIdx;i++){
            int min = Math.min(leftMaxes[i],rightMaxes[i]);
            //柱子上没水
            if (min<=height[i]) continue;
            water += min-height[i];
        }

        return water;

    }

    public static void main(String[] args) {

        System.out.println(trap0(new int[]{1, 2, 0,1,3,1,2}));
        System.out.println(trap(new int[]{1, 2, 0,1,3,1,2}));

    }

}


