class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        if(n < 0) {
            x = 1 / x;
           if (n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE;
                res = x; // For the overflow case, multiply by x one more time later
            } else {
                n = -n;
            }
        }
        
        return power(x , n, res);
    }

    public double power(double x, int n, double res) {
        if (n == 0) {
            return res;
        }
        if (n % 2 != 0) {
            res *= x;
        }
        return power(x * x, n / 2, res);
    }
}