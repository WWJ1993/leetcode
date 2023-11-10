import java.util.ArrayList;

public class Solution {
    private char[][] lettersArray = {
            { 'a', 'b', 'c' },
            { 'd', 'e', 'f' },
            { 'g', 'h', 'i' },
            { 'j', 'k', 'l' },
            { 'm', 'n', 'o' },
            { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' },
            { 'w', 'x', 'y', 'z' }
    };

    public List<String> letterCombinations(String digits) {
        if (digits == null) {
            return null;
        }
        char[] chars = digits.toCharArray();
        List<String> list = new ArrayList<>();
        if (chars.length == 0) {
            return list;
        }
        char[] string = new char[chars.length];
        this.dfs(0, chars, list, string);
        return list;
    }

    public void dfs(int idx, char[] chars, List<String> list, char[] string) {
        if (idx == chars.length) {
            list.add(new String(string));
            return;
        }

        char[] letters = lettersArray[chars[idx] - '2'];
        for (char letter : letters) {
            string[idx] = letter;
            dfs(idx + 1, chars, list, string);
        }
    }

}
