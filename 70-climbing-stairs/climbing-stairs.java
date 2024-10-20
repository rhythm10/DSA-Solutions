class Solution {
    int mod = (int)1e9+7; 


    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        return climb(n, dp);
        
    }

    public int climb(int n, int[] dp) {
        if(n <= 2) {
            return n;
        }
        if(dp[n] != 0) return dp[n];
        dp[n] = climb(n-1,dp) + climb(n-2,dp);
        return dp[n];
    }
}