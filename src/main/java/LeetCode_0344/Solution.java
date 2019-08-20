package LeetCode_0344;

/**
 * Create Time: 2019-08-20 15:28
 * Last Modify: 2019-08-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public void reverseString(char[] s) {
        if (null == s || 1 >= s.length)
            return;

        for (int i = 0; i < s.length / 2; i++) {
            char t = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = t;
        }
    }
}