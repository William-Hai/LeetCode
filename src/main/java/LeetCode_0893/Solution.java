package LeetCode_0893;

/**
 * String
 *
 * Create Time: 2019-09-06 11:26
 * Last Modify: 2019-09-06
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public int numSpecialEquivGroups(String[] A) {
        int count = 0;
        boolean[] flags = new boolean[A.length];
        for (int i = 0; i < A.length; i++) {
            if (flags[i]) continue;
            for (int j = i; j < A.length; j++) {
                if (specialEquals(A[i], A[j])) {
                    if (i == j)
                        count++;
                    flags[j] = true;
                }
            }
        }
        
        return count;
    }

    private boolean specialEquals(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] cs1 = s1.toCharArray(), cs2 = s2.toCharArray();
        int[] r1 = new int[58];
        int[] r2 = new int[58];

        for (int i = 0; i < cs1.length; i++) {
            if (0 == i % 2) {
                r1[cs1[i] - 'A']++;
                r1[cs2[i] - 'A']--;
            } else {
                r2[cs1[i] - 'A']++;
                r2[cs2[i] - 'A']--;
            }
        }

        for (int i = 0; i < 58; i++) {
            if (0 != r1[i] || 0 != r2[i])
                return false;
        }

        return true;
    }
}