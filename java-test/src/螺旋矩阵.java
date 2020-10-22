
import java.util.ArrayList;
import java.util.List;

public class 螺旋矩阵 {
    static public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null) return null;
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) return list;
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[top].length-1;


        while (top<=bottom&&left<=right){
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            if (top>bottom) break;;
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right --;
            if (left>right) break;;
            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom --;
            if (top>bottom) break;;

            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left ++;
            if (left>right) break;;

        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{
                { 1, 2, 3},
                { 4, 5, 6 },
                { 7, 8, 9 }
        }));

    }
}
