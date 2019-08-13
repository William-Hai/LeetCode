package LeetCode_1108;

/**
 * Create Time: 2019-08-13 14:09
 * Last Modify: 2019-08-13
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public String defangIPaddr(String address) {
        char[] chars = address.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            sb.append('.' == c ? "[.]" : c);
        }

        return sb.toString();
    }
}