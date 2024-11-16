class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();

        int i=0,j=1,curr=1,maxRes=1;

        if(s.length() == 0) {
            return 0;
        }

        set.add(s.charAt(0));
        
        for(j=1;j<s.length();j++) {
            while(set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
                curr--;
            }
            curr++;
            if(maxRes < curr) {
                maxRes = curr;
            }
            set.add(s.charAt(j));
        }

        return maxRes;

    }
}