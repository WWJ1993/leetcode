package 数组;

import java.util.HashMap;
import java.util.Map;

public class _12_13_罗马数字转整数 {
     public static int romanToInt(String s) {

        Map<Character,Integer> map = new HashMap<Character,Integer>(){
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        char[] chars = s.toCharArray();

        int value = chars[chars.length-1];
        for (int i = chars.length-1; i >0 ; i--) {
            int c = map.get(chars[i]);
            int next = map.get(chars[i - 1]);
            value = value + next * (map.get(c) > map.get(next) ? -1 : 1);
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.print(romanToInt("III")+"\n");
    }
}
