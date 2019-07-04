package LeetCode_0035;

/**
 * @Author: Q-WHai
 * @Date: Created in 15:57 2019/03/19
 */
public class Solution {

    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] < target) continue;
            break;
        }

        return i;
    }
}