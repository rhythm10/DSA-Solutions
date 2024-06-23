class Solution {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++) {
            //Check even len palindromes
            int left = i, right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if(end-start < right-left) {
                    end = right;
                    start = left;
                }
                left--;
                right++;
            }
            //Check odd len palindromes
            left = i;
            right = i+1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if(end-start < right-left) {
                    end = right;
                    start = left;
                }
                left--;
                right++;
            }
        }
        return s.substring(start, end+1);
    }
}