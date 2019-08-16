import LeetCode_0657.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * Create Time: 2019-08-16 14:39
 * Last Modify: 2019-08-16
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0657_Tests {

    @Test
    public void test1() {
        Assert.assertTrue(new Solution().judgeCircle("UD"));
    }

    @Test
    public void test2() {
        Assert.assertFalse(new Solution().judgeCircle("LL"));
    }
}
