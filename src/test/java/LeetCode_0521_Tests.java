import LeetCode_0521.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * Create Time: 2019-09-06 16:44
 * Last Modify: 2019-09-06
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0521_Tests {

    @Test
    public void test1() {
        Assert.assertEquals(3, new Solution().findLUSlength("aba", "cdc"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(-1, new Solution().findLUSlength("a", "a"));
    }
}
