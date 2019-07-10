package LeetCode_0890;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-09 16:57
 * Last Modify: 2019-07-09
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (word.length() != pattern.length())
                continue;

            if (isMatch(word, pattern))
                list.add(word);
        }

        return list;
    }

    private boolean isMatch(String word, String pattern) {
        char[] cs1 = word.toCharArray();
        char[] cs2 = pattern.toCharArray();
        int[] table1 = new int[26]; // cs1 -> cs2
        int[] table2 = new int[26]; // cs2 -> cs1
        for (int i = 0; i < 26; i++) {
            table1[i] = -1;
            table2[i] = -1;
        }

        for (int i = 0; i < cs1.length; i++) {
            if (-1 == table1[cs1[i] - 'a'] && -1 == table2[cs2[i] - 'a']) {
                table1[cs1[i] - 'a'] = cs2[i];
                table2[cs2[i] - 'a'] = cs1[i];
                continue;
            }

            if (table1[cs1[i] - 'a'] == cs2[i] && table2[cs2[i] - 'a'] == cs1[i])
                continue;

            return false;
        }

        return true;
    }
}