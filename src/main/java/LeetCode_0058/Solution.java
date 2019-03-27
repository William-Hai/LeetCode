package LeetCode_0058;

/**
 * @Author: Q-WHai
 * @Date: Created in 11:26 2019/03/19
 */
class Solution {
    int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int length = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (' ' == chars[i] && 0 != length) break;
            length += (' ' != chars[i]) ? 1 : 0;
        }

        return length;
    }
}