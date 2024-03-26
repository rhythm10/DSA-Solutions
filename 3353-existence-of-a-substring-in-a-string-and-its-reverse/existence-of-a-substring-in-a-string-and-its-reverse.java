class Solution {
    public boolean isSubstringPresent(String s) {
        
        for (int i = 0; i < s.length() - 1; i++) {
            // Extract a substring of length 2 starting from index i
            String substr = s.substring(i, i + 2);
            // Check if this substring is present in the reverse of the string
            String reverse = new StringBuilder(s).reverse().toString();
            if (reverse.contains(substr)) {
                return true;
            }
        }
        return false; // If no such substring is found
    }
}