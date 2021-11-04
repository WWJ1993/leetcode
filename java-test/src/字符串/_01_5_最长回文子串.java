package 字符串;

public class _01_5_最长回文子串 {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int begin = 0;
        int max = 1;
        int i = 0;
        while ( i <chars.length) {
            int left = i-1;
            int right = i;
            while (right<chars.length && chars[i] == chars[right]){
                right++;
            }
            i = right;
            while (left>0&&right<chars.length && chars[left] == chars[right]){
                left--;
                right++;
            }
            if (max<right-left-1){
                max = right-left-1;
                begin = left+1;
            }
        }
        return s.substring(begin,begin+max);
    }
}
