class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int i = 0; // Left pointer of the sliding window
        
        for (int j = 0; j < s.length(); j++) {
            char currentChar = s.charAt(j);
            
            // If we find a repeated character, move `i` to the right of the last occurrence of the character
            if (map.containsKey(currentChar)) {
                i = Math.max(i, map.get(currentChar) + 1);
            }
            
            // Update the last seen index of the current character
            map.put(currentChar, j);
            
            // Update the maximum length of the substring
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;

    }
}