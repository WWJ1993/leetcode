public class Pow {
    //非递归
    static public double myPow1(double x, int n) {
        boolean neg = n<0;
        long y = neg?-((long)n):n;
        double res = 1.0;
        while (y>0){
            //判断奇偶数
            if ((y&1) == 1) {
                res *= x;
            }
            x*=x;
            y = y>>1;
        }

        return neg?1/res: res;
    }
        //递归
    static public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == -1) return 1/x;
        //判断奇偶数
        Boolean odd = (n&1) == 1;
        double half = myPow(x,n>>1);
        half *= half;
        return odd? half*x:half;
    }

    public static void main(String[] args) {
        System.out.println(myPow1(2,-2147483648));
    }

}
