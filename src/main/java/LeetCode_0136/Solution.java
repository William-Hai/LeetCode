package LeetCode_0136;

/**
 * 解题思路：位运算
 *
 * Create Time: 2019-08-20 15:39
 * Last Modify: 2019-08-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int e = 0;
        for (int n : nums) {
            e = e ^ n;
        }

        return e;
    }
}