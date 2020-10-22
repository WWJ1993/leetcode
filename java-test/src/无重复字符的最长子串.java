import java.util.HashMap;
import java.util.Map;

public class 无重复字符的最长子串 {
    static public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        char[] chars = s.toCharArray();
        int li = 0; //i-1 上次出现的位置
        Map<Character,Integer> prevIdxs = new HashMap<>();
        prevIdxs.put(chars[0],0);
        int maxLength = 1;
        for (int i = 1; i < chars.length; i++) {
            //上次出现位置
//            Integer pi = prevIdxs.get(chars[i]);
            Integer pi = prevIdxs.getOrDefault(chars[i],-1);
            if (li<=pi){
                li = pi+1;
            }
            maxLength = Math.max(maxLength,i-li+1);
            prevIdxs.put(chars[i],i);
        }
        return maxLength;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring(""));
    }
}
