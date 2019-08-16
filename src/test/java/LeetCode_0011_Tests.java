import LeetCode_0011.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * Create Time: 2019-08-16 16:47
 * Last Modify: 2019-08-16
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0011_Tests {

    @Test
    public void test1() {
        Assert.assertEquals(49, new Solution().maxArea(new int[] { 1,8,6,2,5,4,8,3,7 }));
    }
}
