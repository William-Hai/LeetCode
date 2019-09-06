package LeetCode_1170;

/**
 * String
 *
 * Create Time: 2019-09-06 15:52
 * Last Modify: 2019-09-06
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] res = new int[queries.length];
        int[] wf = new int[words.length];
        for (int i = 0; i < words.length; i++)
            wf[i] = f(words[i]);

        for (int i = 0; i < queries.length; i++) {
            int f1 = f(queries[i]);
            for (int f2 : wf)
                if (f1 < f2)
                    res[i]++;
        }

        return res;
    }

    private int f(String s) {
        int count = 0;
        char min = Character.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            //
            char tmp = s.charAt(i);
            if (tmp == min) {
                count++;
            } else if (tmp < min) {
                min = tmp;
                count = 1;
            }
        }

        return count;
    }
}
