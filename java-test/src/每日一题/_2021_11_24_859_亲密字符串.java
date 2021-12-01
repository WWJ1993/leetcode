package 每日一题;

public class _2021_11_24_859_亲密字符串 {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;

        char[] chars1 = s.toCharArray();
        char[] chars2 = goal.toCharArray();
        int num = 0;
        boolean buddy = false;
        for(int i = 0;i<chars1.length;i++){
            if (chars1[i] != chars2[i]){
                if (num == 1){
                    buddy = true;
                }else if(num > 1){
                    buddy = false;
                }
                num ++;
            }
        }
        return buddy;
    }
}
