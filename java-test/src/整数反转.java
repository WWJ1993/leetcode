public class 整数反转 {
    static public int reverse(int x) {
        long res = 0;
        while (x!=0){
            res = x%10+10*res;
            if (res>Integer.MAX_VALUE) return 0;
            if (res<Integer.MIN_VALUE) return 0;
            x = x/10;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1999999999));
    }
}