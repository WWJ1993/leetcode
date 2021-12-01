package 高频题;

import java.util.ArrayList;
import java.util.List;

public class _14_118_杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0|| j == i){
                    subList.add(1);
                }else {
                    List<Integer> preList = list.get(i-1);
                    subList.add(preList.get(j-1)+preList.get(j));
                }
            }
            list.add(subList);
        }
        return list;
    }
}
