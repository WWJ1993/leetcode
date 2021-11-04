package 高频题;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _10_3_无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        //左指针
        int li = 0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
//            Integer idx = map.getOrDefault(c,-1);
            map.put(c,i);
            if (map.containsKey(c)){ //没出现过
                li = Math.max(li,map.get(c)+1);
            }
            max = Math.max(max,i-li+1);
        }
        return max;
    }


}
