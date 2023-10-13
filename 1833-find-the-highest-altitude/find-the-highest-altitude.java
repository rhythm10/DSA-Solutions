class Solution {
    public int largestAltitude(int[] gain) {
        int s = 0;
        int ans = 0;

        for(int i=0;i<gain.length;i++)
        {
            s = s + gain[i];
            if(ans <= s)
            {
                ans = s;
            }
        }

        return ans;
    }
}