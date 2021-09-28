package 动态规划;
//https://leetcode-cn.com/problems/longest-palindromic-substring/
public class _03_05最长回文子串 {

    //扩展中心法
    //元素两侧扩展，找到最大距离
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        if (s.length() == 1) return s;
        int begin = 0;
        int maxLen = 1;
        char[] chars = s.toCharArray();

        int i=0;
        while (i<chars.length){
            int l = i-1;
            int r = i;
            while (++r<chars.length && chars[r]==chars[i]);
            i = r;
            System.out.println("r:"+r+",i:"+i+",l:"+l);

            while (l>=0 && r<chars.length &&chars[r]==chars[l]){
                l--;
                r++;
            }


            if (maxLen<r-l-1){
                maxLen = r-l-1;
                begin = l+1;
            }

        }
//        for (int i = 0; i < chars.length; i++) {
//            int l = i,r = i;
//            while (l>0&&r<chars.length&&chars[l] == chars[i]) {
//                l--;
//            }
//
//            while (l>=0&&r<chars.length) {
//                if (chars[r] != chars[i]) break;;
//                r++;
//            }
//            while (l>=0&&r<chars.length) {
//                if (chars[l] != chars[r]) break;
//                l--;
//                r++;
//            }
//
//            if (maxLen<r-l-1){
//                maxLen = r-l-1;
//                begin = l+1;
//            }
//        }
        return s.substring(begin,begin+maxLen);
    }

//    以元素及间隙为中心，向两次扩散
    public String longestPalindrome2(String s) {
        if (s == null || s.length() < 1) return "";
        if (s.length() == 1) return s;
        int begin = 0;
        int maxLen = 1;
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            int length1 = palindromeLength(chars,i,i);
            int length2 = palindromeLength(chars,i-1,i);
            length1 = Math.max(length1,length2);
            if (maxLen<length1){
                maxLen = length1;
                begin = i-(maxLen>>1);
            }
        }
//        int length = palindromeLength(chars,chars.length-2,chars.length-1);
//        if (maxLen<length){
//            maxLen = length;
//            begin = chars.length-1-(maxLen>>1);
//        }

        return s.substring(begin,begin+maxLen);
    }
    public int palindromeLength(char[] chars,int l, int r){
        while (l>=0&&r<chars.length){
            if (chars[l] != chars[r]) break;
            l--;
            r++;
        }
        return r-l-1;
    }

    //动态规划
    public static String longestPalindrome1(String s) {
        if (s == null || s.length()<1) return "";
        if (s.length()==1) return s;

        char[] chars = s.toCharArray();
        boolean[][] dp = new boolean[chars.length][chars.length];
        int begin = 0;
        int maxLen = 1;

        for (int i = chars.length-1; i >=0 ; i--) {
            for (int j = i; j < chars.length; j++) {
//                if (j-i<2){
//                    dp[i][j] = chars[i] == chars[j];
//                }else {
//
//                    dp[i][j] = dp[i+1][j-1]&&chars[i] == chars[j];
//                }
                dp[i][j] = (j-i<2||dp[i+1][j-1])&&chars[i] == chars[j];
                if (dp[i][j]&&maxLen<j-i+1){
                    maxLen = j-i+1;
                    begin = i;
                }
            }

        }
        return s.substring(begin,begin+maxLen);

    }

    public static void main(String[] args) {
        System.out.println((new _03_05最长回文子串()).longestPalindrome("cbba"));
    }

}
