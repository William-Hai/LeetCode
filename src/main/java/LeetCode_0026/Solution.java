package LeetCode_0026;

/**
 * @Author: Q-WHai
 * @Date: Created in 14:16 2019/03/19
 */
class Solution {

    int removeDuplicates(int[] nums) {
        if (0 == nums.length) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}