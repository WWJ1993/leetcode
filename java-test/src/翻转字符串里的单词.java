import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 翻转字符串里的单词 {
//    public static String reverseWords(String s) {
//
//        String [] sp =  s.split("\\s+");
//        String sa = "";
//        for (int i = sp.length-1; i >= 0  ; i--) {
//            String ss = sp[i];
//            if (sa.length()==0){
//                sa = ss;
//            }else if(i==0&&ss.length() == 0){
//            }else{
//                sa = sa+" "+ss;
//             }
//
//        }
//
//        return sa;
//    }

    public static String reverseWords(String s) {
        if (s == null) return null;
        char[] chars  = s.toCharArray();
        int cur = 0;
        int len = 0;
        Boolean space = true;
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != ' '){//非空格
                chars[cur] = chars[i];
                cur ++;
                space = false;
            }else { //  空格字符
                if (!space){
                    chars[cur] = chars[i];
                    cur ++;
                    space = true;
                }
            }
        }

        len = space?(cur-1):cur;

        return new String(chars,0,cur);
    }

    public static void main(String[] args) {
        String s3 = "  hello world!  hhh ";
        System.out.println(reverseWords(s3));
    }
}
