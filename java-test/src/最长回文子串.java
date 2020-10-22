public class 最长回文子串 {


    static public String longestPalindrome(String s) {
        if (s == null || s.length()<1) return "";
        if (s.length()==1) return s;
        int begin = 0;
        int maxLen = 1;



        return s;
    }

        //动态规划
    static public String longestPalindrome2(String s) {

        if (s == null || s.length()<1) return "";
        if (s.length()==1) return s;
        int begin = 0;
        int maxLen = 1;

        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = s.length()-1;i>=0;i--){
            for (int j = i; j < s.length()  ; j++) {
                if (i == j){
                    dp[i][j] = true;
                }else if ((j-i+1<=2)){
                    dp[i][j] = s.charAt(i)==s.charAt(j);

                }else {
                    dp[i][j] = dp[i+1][j-1]&&s.charAt(i)==s.charAt(j);

                }

                if (dp[i][j]&&maxLen<j-i+1) {
                    maxLen = j-i+1;
                    begin = i;
                }

            }
        }

        return s.substring(begin,begin+maxLen);
    }
//中心法
        static public String longestPalindrome1(String s) {
        if (s == null || s.length()<1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 =  getSubStringLen(s,i,i);
            int len2 = getSubStringLen(s,i,i+1);
            int maxLen = Math.max(len1,len2);
            if (maxLen>end - start){
                start = i - (maxLen-1)/2;
                end = i+maxLen/2;
            }
        }
        return s.substring(start,end+1);
    }





    private static int getSubStringLen(String s, int left, int right){


        int l = left, r = right;
        while (l>=0 && r<s.length() && s.charAt(l) == s.charAt(r) ){
            l--;
            r++;
        }
        return r-l-1;
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

}

