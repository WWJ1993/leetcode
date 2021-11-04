package A面试遇到的;

import javax.swing.event.ListDataEvent;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public int test(int x[]){
        Arrays.sort(x);
        for (int i = 0; i < x.length; i++) {
            int num = x[i];
            if (num >= 7) return i;
        }
        return x.length;
    }

    public int[] test1(int a){
        int[] array = new int[7];
        for (int i = 6; i >=0 ; i--) {
            array[i] = 57-a*(6-i);
        }
        return array;
    }

    public int test2(int[] array){
        if (array == null)  return 0;
        if (array.length == 0) return 0;
        return 0;
    }

}
