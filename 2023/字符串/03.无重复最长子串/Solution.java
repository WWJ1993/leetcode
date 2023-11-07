import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<Character>();
        int max = 0;
        int li = -1;
        for (int i = 0; i < chars.length; i++) {
            while (li + 1 < i && set.contains(chars[i])) {
                set.remove(chars[li + 1]);
                li++;
            }
            set.add(chars[i]);
            max = Math.max(max, i - li);
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        Set<Character> set = new HashSet<Character>();
        int max = 0;
        int li = -1;
        for (int i = 0; i < s.length(); i++) {
            while (li + 1 < i && set.contains(s.charAt(i))) {
                set.remove(s.charAt(li + 1));
                li++;
                System.out.println("+++" + s.charAt(li) + "--li=" + li + ",--i=" + i);
            }
            set.add(s.charAt(i));
            max = Math.max(max, i - li);
            System.out.println("---i=" + i + "--" + s.charAt(i) + "--- i - li = " + (i - li));

        }
        return max;
    }

    public int lengthOfLongestSubstring1(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int li = -1; // 记录i-1 元素上次出现位置
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            // c 之前出现的位置
            Integer lastIdx = map.getOrDefault(c, -1);
            if (li <= lastIdx) { // 如果li 在 lastIdx 之前，更新li 滑动到 lastIdx
                li = lastIdx;
            }
            map.put(c, i);
            max = Math.max(max, i - li);
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(new Solution().lengthOfLongestSubstring("pwwkew"));
        // System.out.println(new Solution().lengthOfLongestSubstring("au"));

    }
}
