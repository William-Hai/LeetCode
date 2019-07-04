import LeetCode_0807.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-01 15:16
 * Last Modify: 2019-07-01
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0807_Tests {

    @Test
    public void test1() {
        int[][] g = new int[][] {
                { 3, 0, 8, 4 },
                { 2, 4, 5, 7 },
                { 9, 2, 6, 3 },
                { 0, 3, 1, 0 }
        };

        Assert.assertEquals(35, new Solution().maxIncreaseKeepingSkyline(g));
    }
}
