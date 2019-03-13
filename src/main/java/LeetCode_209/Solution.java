package LeetCode_209;

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }

        int left = 0;
        int right = left;

        int sum = 0;
        int minLength = -1; // 最小子数组长度

        do {
            if (sum < s) {
                sum += nums[right];
                right++;
                continue;
            }

            if (minLength == -1 || right - left < minLength) {
                minLength = right - left;
            }
            sum -= nums[left];
            left++;

        } while (right < length || sum >= s);

        return minLength == -1 ? 0 : minLength;
    }
}