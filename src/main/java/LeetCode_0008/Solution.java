package LeetCode_0008;

/**
 * @Author: Q-WHai
 * @Date: Created in 18:02 2019/03/19
 */
public class Solution {

    public int myAtoi(String str) {
        char[] chars = str.toCharArray();
        if (0 == chars.length) return 0;
        int sign = 1, i = 0;
        while (' ' == chars[i]) {
            i++;
            if (i >= chars.length) return 0;
        }

        if ('-' == chars[i]) { sign = -1; i++; }
        else if ('+' == chars[i]) i++;

        int base = 0;
        for (int j = i; j < chars.length; j++) {
            if (!isNumber(chars[j])) break;

            if (1 == sign && (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && '7' < chars[j]))) {
                return Integer.MAX_VALUE;
            } else if (-1 == sign && (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && '8' < chars[j]))) {
                return Integer.MIN_VALUE;
            }

            base = 10 * base + (chars[j] - '0');
        }

        return sign * base;
    }

    private boolean isNumber(char c) {
        return '0' <= c && c <= '9';
    }
}
