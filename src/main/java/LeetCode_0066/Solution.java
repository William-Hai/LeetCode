package LeetCode_0066;

public class Solution {

    public int[] plusOne(int[] digits) {
        if (null == digits || 0 == digits.length) return new int[] { 1 };

        int overflow = 0;
        int[] result = new int[digits.length];
        for (int i = digits.length - 1; i >= 0; i--) {
            result[i] = (digits[i] + ((digits.length - 1) == i ? 1 : 0) + overflow) % 10;
            overflow = (digits[i] + ((digits.length - 1) == i ? 1 : 0) + overflow) / 10;
        }

        if (0 == overflow) return result;

        int[] result2 = new int[digits.length + 1];
        result2[0] = overflow;
        for (int i = 0; i < result.length; i++) {
            result2[i + 1] = result[i];
        }

        return result2;
    }
}