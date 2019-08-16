package LeetCode_0015;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: 效率待优化
 *
 * Create Time: 2019-08-16 17:32
 * Last Modify: 2019-08-16
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                continue;

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int a = nums[i], b = nums[left], c = nums[right];
                if (0 < a + b + c) {
                    right--;
                    continue;
                }

                if (0 == a + b + c) {
                    if (!exists(result, a, b , c)) {
                        result.add(new ArrayList<Integer>(){{
                            add(a);
                            add(b);
                            add(c);
                        }});
                    }
                }

                left++;
            }
        }

        return result;
    }

    private void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
        }
    }

    private boolean exists(List<List<Integer>> box, int a, int b, int c) {
        for (List<Integer> list : box) {
            if ((list.get(0) == a) && (list.get(1) == b) && (list.get(2) == c)) {
                return true;
            }
        }

        return false;
    }
}