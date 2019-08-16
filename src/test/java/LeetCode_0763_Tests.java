import LeetCode_0763.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Create Time: 2019-08-16 15:33
 * Last Modify: 2019-08-16
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0763_Tests {

    @Test
    public void test1() {
        int[] expected = { 9,7,8 };
        List<Integer> actual = new Solution().partitionLabels("ababcbacadefegdehijhklij");

        Assert.assertEquals(expected.length, actual.size());
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], (int)actual.get(i));
        }
    }

    @Test
    public void test2() {
        int[] expected = { 9,7,8 };
        List<Integer> actual = new Solution().partitionLabels("zbzbcbzczdefegdehijhklij");

        Assert.assertEquals(expected.length, actual.size());
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], (int)actual.get(i));
        }
    }
}
