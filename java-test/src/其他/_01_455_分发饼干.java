package 其他;

import java.util.Arrays;

public class _01_455_分发饼干 {
    public int findContentChildren(int[] g, int[] s) {
        //排序
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0,j = 0;
        int count = 0;
        while (i<g.length && j < s.length){
            while (j < s.length && (s[j] < g[i]) ) j++;
            if ( j < s.length) count ++;
            i++;
            j++;
        }
        return  count;
    }
}
