class Solution {
    public int fib(int n) {
        return fibb(n);
    }

    public int fibb(int n) {
        if(n <= 1) {
            return n;
        }
        return fibb(n-1) + fibb(n-2);

    }
}