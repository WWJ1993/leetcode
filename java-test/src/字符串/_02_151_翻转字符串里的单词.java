package 字符串;

public class _02_151_翻转字符串里的单词 {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int index = 0;
        boolean space = true;    //  前一个是空格
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' '){
                chars[index] = chars[i];
                index ++;
                space = false;
            }else if(space == false){
                chars[index] = ' ';
                index ++;
                space = true;
            }
        }


        int len = space?(index-1):index;
        //反转
        reverse(chars,0,len-1);

        index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] == ' '){
                reverse(chars,index,i-1);
                index = i+1;
            }
        }
        return new String(chars,0,len);
    }


    public void reverse(char[] chars,int left,int right){
        while (left<right){
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        System.out.println((new _02_151_翻转字符串里的单词()).reverseWords("are  you happy?  "));
    }
}
