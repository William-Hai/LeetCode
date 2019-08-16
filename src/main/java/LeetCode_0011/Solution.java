package LeetCode_0011;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: 效率待优化
 *
 * Create Time: 2019-08-16 16:46
 * Last Modify: 2019-08-16
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public int maxArea(int[] height) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0, max = 0; i < height.length; i++) {
            if (height[i] <= max)
                continue;

            left.add(i);
            max = height[i];
        }

        for (int i = height.length - 1, max = 0; i >= 0; i--) {
            if (height[i] <= max)
                continue;

            right.add(i);
            max = height[i];
        }

        int max = 0;
        for (int l : left) {
            for (int r : right) {
                if (l >= r)
                    continue;

                max = Math.max(max, (r - l) * (height[l] < height[r] ? height[l] : height[r]));
            }
        }

        return max;
    }
}