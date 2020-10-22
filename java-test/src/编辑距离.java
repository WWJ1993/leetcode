public class 编辑距离 {
    static public int minDistance(String word1, String word2) {
        if (word1 == null || word2 == null) return 0;
        if (word1.length() == 0) return word2.length();
        if (word2.length() == 0) return word1.length();
        int dp[][] = new int[word1.length()+1][word2.length()+1];
        dp[0][0] = 0;
        char[] wordArray1 = word1.toCharArray();
        char[] wordArray2 = word2.toCharArray();

        for (int i = 1;i<=wordArray1.length;i++){
            dp[i][0] = i;
        }
        for (int i = 1;i<=wordArray2.length;i++) {
            dp[0][i] = i;
        }
        for (int i = 1;i<=word1.length();i++) {
            for (int j = 1;j<=word2.length();j++) {

                int min = Math.min(dp[i-1][j]+1,dp[i][j-1]+1);
                min = Math.min(min,wordArray1[i-1]==wordArray2[j-1]?dp[i-1][j-1]:dp[i-1][j-1]+1);
                dp[i][j] = min;
            }
        }
        return dp[word1.length()][word2.length()];
    }

    public static void main(String[] args) {

        System.out.println(minDistance("","123"));
    }
}
