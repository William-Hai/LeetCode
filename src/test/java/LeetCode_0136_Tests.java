import LeetCode_0136.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * Create Time: 2019-08-20 15:40
 * Last Modify: 2019-08-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0136_Tests {

    @Test
    public void test1() {
        Assert.assertEquals(1, new Solution().singleNumber(new int[] { 2,2,1 }));
    }

    @Test
    public void test2() {
        Assert.assertEquals(4, new Solution().singleNumber(new int[] { 4,1,2,1,2 }));
    }
}
