package LeetCode_0657;

/**
 * TODO
 * <p>
 * Create Time: 2019-08-16 14:37
 * Last Modify: 2019-08-16
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();

        int v = 0, h = 0;
        for (char c : chars) {
            if ('L' == c)
                h--;
            else if ('R' == c)
                h++;
            else if ('U' == c)
                v++;
            else if ('D' == c)
                v--;
        }

        return 0 == v && 0 == h;
    }
}