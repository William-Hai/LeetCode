package LeetCode_0905;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 15:29
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class SolutionTests {

    @Test
    public void test1() {
        int[] a = new int[] { 2, 4, 3, 1 };
        List<int[]> expected = new ArrayList<int[]>(){{
            add(new int[] { 4, 2, 3, 1 });
            add(new int[] { 4, 2, 1, 3 });
            add(new int[] { 2, 4, 3, 1 });
            add(new int[] { 2, 4, 1, 3 });
        }};

        Assert.assertTrue(contains(expected, a));
    }

    @Test
    public void test2() {
        int[] result = new Solution().sortArrayByParity(new int[] { 3, 1, 2, 4 });

        List<int[]> expected = new ArrayList<int[]>(){{
            add(new int[] { 4, 2, 3, 1 });
            add(new int[] { 4, 2, 1, 3 });
            add(new int[] { 2, 4, 3, 1 });
            add(new int[] { 2, 4, 1, 3 });
        }};

        Assert.assertTrue(contains(expected, result));
    }

    private boolean contains(List<int[]> list, int[] arr) {
        if (null == list || null == arr)
            return false;

        for (int[] item : list) {
            boolean same = true;
            for (int i = 0; i < item.length; i++) {
                same = same && (item[i] == arr[i]);
            }

            if (same) return true;
        }

        return false;
    }
}
