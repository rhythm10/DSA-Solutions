class Solution {
    public int[] plusOne(int[] digits) {
        int remainder = 0;
        int digitCount = digits.length - 1;
        digits[digitCount] = digits[digitCount] + 1;

        do {
            if (digits[digitCount] + remainder > 9) {
                digits[digitCount] = (digits[digitCount] + remainder) % 10;
                remainder = 1;
            } else {
                digits[digitCount] = (digits[digitCount] + remainder);
                remainder = 0;
            }

            digitCount--;
        } while (remainder != 0 && digitCount >= 0);

        if (remainder == 1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;

            System.arraycopy(digits, 0, newDigits, 1, digits.length);

            return newDigits;
        }

        return digits; 
    }
}