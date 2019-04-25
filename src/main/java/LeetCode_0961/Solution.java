package LeetCode_0961;

/**
 * @Author: Q-WHai
 * @Date: Created in 13:35 2019/04/25
 */
class Solution {
    int repeatedNTimes(int[] A) {
        int n = A.length / 2;
        int[] counts = new int[A.length];
        counts[0] = 1;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (-1 == counts[j]) continue;

                if (0 < counts[j]) {
                    if (A[i] == A[j]) {
                        counts[i] = -1;
                        counts[j] ++;
                    }
                }
            }

            if (0 == counts[i]) counts[i] ++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (n == counts[i]) return A[i];
        }

        return 0;
    }
}