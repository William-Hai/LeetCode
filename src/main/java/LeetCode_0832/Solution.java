package LeetCode_0832;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 15:59
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
class Solution {
    int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length / 2; j++) {
                A[i][j] = A[i][j] + A[i][A[i].length - j - 1];
                A[i][A[i].length - j - 1] = A[i][j] - A[i][A[i].length - j - 1];
                A[i][j] = A[i][j] - A[i][A[i].length - j - 1];
            }

            for (int j = 0; j < A[i].length; j++)
                A[i][j] ^= 1;
        }

        return A;
    }
}
