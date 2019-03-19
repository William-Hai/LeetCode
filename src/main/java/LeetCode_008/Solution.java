package LeetCode_008;

import java.util.Arrays;

/**
 * @Author: Q-WHai
 * @Date: Created in 18:02 2019/03/19
 */
class Solution {

    int myAtoi(String str) {
        char[] chars = str.toCharArray();
        char[] records = new char[chars.length];
        int i = 0, j = -1;
        for (char c:
                chars) {
            if (access(c)) {
                j = i++;
                records[j] = c;
            } else if (!access(c) && !ignore(c)) {
                break;
            }
        }

        return -1 == j ? 0 : transform(Arrays.copyOf(records, j + 1));
    }

    private int outBoundary(char[] chars) {
        return '-' == chars[0] ? outMinBoundary(chars) : outMaxBoundary(chars);
    }

    //-2147483648
    private int outMinBoundary(char[] chars) {
        char[] min = new char[] { '2', '1', '4', '7', '4', '8', '3', '6', '4', '8' };
        if (11 < chars.length) return -1;
        if (11 == chars.length) {
            for (int i = 0; i < min.length; i++) {
                if (chars[i + 1] < min[i]) return 0;
                else if (chars[i + 1] > min[i]) return -1;
            }
        }

        return 0;
    }

    // 2147483647
    private int outMaxBoundary(char[] chars) {
        char[] max = new char[] { '2', '1', '4', '7', '4', '8', '3', '6', '4', '7' };
        if (10 < chars.length) return 1;
        if (10 == chars.length) {
            for (int i = 0; i < max.length; i++) {
                if (chars[i] < max[i]) return 0;
                else if (chars[i] > max[i]) return 1;
            }
        }
        return 0;
    }

    private int transform(char[] chars) {
        if (!isNumerical(chars)) return 0;

        int b = outBoundary(cleanup(chars));
        return -1 == b ? Integer.MIN_VALUE : 0 == b ? Integer.valueOf(String.valueOf(chars).trim()) : Integer.MAX_VALUE;
    }

    private boolean access(char c) {
        return '-' == c || '+' == c || isNumericalDigit(c);
    }

    private boolean isNumericalDigit(char c) {
        return '0' <= c && c <= '9';
    }

    private boolean ignore(char c) {
        return ' ' == c || '+' == c;
    }

    private boolean isNumerical(char[] chars) {
        int i = 0;
        if ('-' == chars[0] || '+' == chars[0]) {
            if (1 == chars.length) return false;
            i = 1;
        }

        for (int j = i; j < chars.length; j++) {
            if (!isNumericalDigit(chars[j])) return false;
        }

        return true;
    }

    private char[] cleanup(char[] chars) {
        int s = 0;
        boolean stop = false;
        for (int i = 0; i < chars.length; i++) {
            if (stop) break;

            if (' ' == chars[i] || '0' == chars[i]) {
                s++;
            } else {
                stop = true;
            }
        }

        return s == chars.length ? new char[] { '0' } : Arrays.copyOfRange(chars, s, chars.length);
    }
}
