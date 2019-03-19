package LeetCode_035;

/**
 * @Author: Q-WHai
 * @Date: Created in 15:57 2019/03/19
 */
class Solution {

    int searchInsert(int[] nums, int target) {
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] < target) continue;
            break;
        }

        return i;
    }
}