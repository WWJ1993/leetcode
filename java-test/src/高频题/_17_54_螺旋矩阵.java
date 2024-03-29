package 高频题;

import java.util.ArrayList;
import java.util.List;

public class _17_54_螺旋矩阵 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        if (matrix.length == 0) return list;

        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        while(left<=right && top<=bottom){
            for(int i = left;i<= right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            if (top>bottom) break;;

            for(int i = top;i<= bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if (left>right) break;

            for(int i = right;i>= left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            if (top>bottom) break;

            for(int i = bottom;i>= top;i--){
                list.add(matrix[i][left]);
            }
            left++;
            if (left>right) break;
        }
        return list;
    }
}
