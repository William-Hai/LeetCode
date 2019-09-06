package LeetCode_0557;

/**
 * String
 *
 * Create Time: 2019-09-06 10:46
 * Last Modify: 2019-09-06
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public String reverseWords(String s) {
        int si = -1, ei = -1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (' ' == s.charAt(i)) {
                reverseWords(chars, si, ei);
                si = -1; ei = -1;
            } else {
                if (-1 == si) {
                    si = i;
                }

                ei = i;
            }
        }

        if (-1 != si)
            reverseWords(chars, si, ei);

        return new String(chars);
    }

    private void reverseWords(char[] chars, int si, int ei) {
        for (int i = si; i <= (ei + si)/2; i++) {
            char tmp = chars[i];
            chars[i] = chars[si + ei - i];
            chars[si + ei - i] = tmp;
        }
    }
}
