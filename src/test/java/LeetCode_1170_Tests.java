import LeetCode_1170.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * Create Time: 2019-09-06 15:52
 * Last Modify: 2019-09-06
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_1170_Tests {

    @Test
    public void test1() {
        String[] queries = new String[] { "cbd" };
        String[] words = new String[] { "zaaaz" };

        int[] expecteds = new Solution().numSmallerByFrequency(queries, words);
        Assert.assertArrayEquals(expecteds, new int[] { 1 });
    }

    @Test
    public void test2() {
        String[] queries = new String[] { "bbb","cc" };
        String[] words = new String[] { "a","aa","aaa","aaaa" };

        int[] expecteds = new Solution().numSmallerByFrequency(queries, words);
        Assert.assertArrayEquals(expecteds, new int[] { 1, 2 });
    }
}
