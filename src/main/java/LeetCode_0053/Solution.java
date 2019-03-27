package LeetCode_0053;

/**
 * @Author: Q-WHai
 * @Date: Created in 10:35 2019/03/19
 */
class Solution {
    int maxSubArray(int[] nums) {
        int sum = 0;
        int psum = 0;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n > max) max = n;
            psum += n;
            if (psum > sum) sum = psum;
            if (psum < 0) psum = 0;
        }

        return max < 0 ? max : sum;
    }
}