package LeetCode_0950;

import java.util.ArrayList;
import java.util.List;

/**
 * 解题思路：
 *  把过程反转，即先整理出有序序列，再从大小到小处理：将序列末尾的放到序列的头，再在头部添加一个新元素
 *
 * Create Time: 2019-08-15 11:07
 * Last Modify: 2019-08-15
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        sort(deck);
        List<Integer> list = new ArrayList<>(deck.length);
        for (int i = 0; i < deck.length; i++) {
            if (0 == i || 1 == i) {
                list.add(0, deck[i]);
                continue;
            }

            int tmp = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, tmp);
            list.add(0, deck[i]);
        }

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    private void sort(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            for (int j = i + 1; j < deck.length; j++) {
                if (deck[i] < deck[j]) {
                    deck[i] = deck[i] + deck[j];
                    deck[j] = deck[i] - deck[j];
                    deck[i] = deck[i] - deck[j];
                }
            }
        }
    }
}