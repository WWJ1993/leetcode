package DFS;

import java.util.ArrayList;
import java.util.List;

public class _01_17_电话号码的字母组合 {
    private char[][] lettersArray = {
            {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
            {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}
    };
    public List<String> letterCombinations(String digits) {
        if (digits == null) return null;
        List<String> list = new ArrayList<>() ;
        char[] chars = digits.toCharArray();
        if (chars.length == 0) return  list;
        char[] string = new char[chars.length];

        dfs(0,list,chars,string);
        return list;

    }

/*
* deep: 层数
* list: 记录组合结果
* chars: 数字对应的字符
* string：记录这次生成的字符串
* */
    public void dfs(int deep,List<String> list,char[] chars,char[] string){

        if (chars.length == deep){
            list.add(new String(string));
            return;
        }
        char[] letters = lettersArray[chars[deep]-'2'];
        for (int i = 0; i < letters.length; i++) {
            string[deep] = letters[i];
            dfs(deep+1,list,chars,string);
        }

    }

    public static void main(String[] args) {
        _01_17_电话号码的字母组合 c = new _01_17_电话号码的字母组合();
        c.letterCombinations("345");
    }
}
