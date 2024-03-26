class Solution {
    public long countSubstrings(String s, char c) {

        long count = 0;
        for(long i=0;i<s.length();i++)
        {
            if(s.charAt((int)i) == c)
            {
                count++;
            }
        }
        return (count * (count+1))/2;
    }
}