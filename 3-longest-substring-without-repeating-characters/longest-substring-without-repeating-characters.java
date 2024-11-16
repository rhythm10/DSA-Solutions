class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int i = 0; // Left pointer of the sliding window

        // Traverse through the string with the right pointer (j)
        for (int j = 0; j < s.length(); j++) {
            // If the character is already in the set, remove characters from the left
            // until we remove the duplicate character
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }
            
            // Add the current character to the set
            set.add(s.charAt(j));
            
            // Update the maximum length of the substring
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;

    }
}