package LeetCode_027;

/**
 * @Author: Q-WHai
 * @Date: Created in 14:36 2019/03/19
 */
class Solution {
    int removeElement(int[] nums, int val) {
        int count = nums.length;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (val == nums[i]) {
                remove(nums, i);
                count--;
            }
        }
        return count;
    }

    void remove(int[] nums, int i) {
        for (int j = i + 1; j < nums.length; j++) {
            nums[j - 1] = nums[j];
        }
    }
}
