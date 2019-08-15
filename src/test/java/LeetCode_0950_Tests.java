import LeetCode_0950.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * Create Time: 2019-08-15 11:13
 * Last Modify: 2019-08-15
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0950_Tests {

    @Test
    public void test1() {
        int[] actual = new Solution().deckRevealedIncreasing(new int[] { 17,13,11,2,3,5,7 });
        int[] expected = { 2,13,3,11,5,17,7 };

        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], actual[i]);
        }
    }
}
