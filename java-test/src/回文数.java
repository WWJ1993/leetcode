public class 回文数 {

    static public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int res = 0;
        Boolean neg = (x&1) == 1;
        while (x>res){
            res = x%10+res*10;
            x = x/10;
        }
        return x == res/10||x == res;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
}
