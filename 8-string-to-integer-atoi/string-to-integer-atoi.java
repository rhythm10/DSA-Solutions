class Solution {
    public int myAtoi(String s) {
        boolean first = true;
        String res = "";
        int i=0;
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        if(s.charAt(0) == '+' || s.charAt(0) == '-') {
            if(s.charAt(0) == '-') {
                res += "-";
            }
            i++;
        }
        return getAtoi(s,res, i, s.length(), first);
    }

    public int getAtoi(String s, String res, int i, int n, boolean first) {
        if (i == n) {
            return parseResult(res);
        }

        char currentChar = s.charAt(i);
        if (Character.isDigit(currentChar)) {
            if (currentChar == '0' && first) {
                return getAtoi(s, res, i + 1, n, true);
            } else {
                res += currentChar;
                return getAtoi(s, res, i + 1, n, false);
            }
        } else {
            return parseResult(res);
        }
    }

    private int parseResult(String res) {
        if (res.equals("-")|| res.isEmpty()) {
            return 0;
        }

        try {
            long result = Long.parseLong(res);
            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else {
                return (int) result;
            }
        } catch (NumberFormatException e) {
            if (res.startsWith("-")) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    
    }
}