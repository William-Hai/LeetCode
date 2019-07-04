package LeetCode_0905;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 15:28
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {

    public int[] sortArrayByParity(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (0 == A[i] % 2)
                continue;

            for (int j = i + 1; j < A.length; j++) {
                if (0 == A[j] % 2){
                    A[i] = A[i] + A[j];
                    A[j] = A[i] - A[j];
                    A[i] = A[i] - A[j];
                    break;
                }
            }
        }

        return A;
    }
}