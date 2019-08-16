package LeetCode_0977;

import java.util.Stack;

/**
 * 解题思路：利用栈保存小于0的数据，从而完成O(n)时间复杂度的算法
 *
 * Create Time: 2019-08-16 14:51
 * Last Modify: 2019-08-16
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int index = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.length;) {
            if (0 > A[i]) {
                stack.push(-1 * A[i]);
                i++;
                continue;
            }

            if (stack.isEmpty()) {
                result[index++] = A[i] * A[i];
                i++;
                continue;
            }

            int a = stack.peek();
            if (A[i] <= a) {
                result[index++] = A[i] * A[i];
                i++;
            } else {
                result[index++] = a * a;
                stack.pop();
            }
        }

        while (!stack.isEmpty()) {
            int x = stack.pop();
            result[index++] = x * x;
        }

        return result;
    }
}