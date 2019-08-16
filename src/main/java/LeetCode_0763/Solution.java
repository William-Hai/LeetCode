package LeetCode_0763;

import java.util.*;

/**
 * 解题思路：通过不断重置区域的右边界来达到最优解
 *
 * Create Time: 2019-08-16 15:33
 * Last Modify: 2019-08-16
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public List<Integer> partitionLabels(String S) {
        char[] chars = S.toCharArray();

        Map<Character, Integer> eimap = new HashMap<>(); // 记录各个字母的最后一次出现的位置
        for (int i = 0; i < chars.length; i++) {
            if (eimap.containsKey(chars[i]))
                eimap.replace(chars[i], i);
            else
                eimap.put(chars[i], i);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < chars.length;) {
            int ei = eimap.get(chars[i]); // 最后一次出现的位置

            int count = 0;
            while (i <= ei) {
                count++;
                int j = eimap.get(chars[i++]);
                ei = j <= ei ? ei : j;
            }

            result.add(count);
        }

        return result;
    }
}