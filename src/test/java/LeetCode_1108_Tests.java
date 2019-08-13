import LeetCode_1108.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * Create Time: 2019-08-13 14:10
 * Last Modify: 2019-08-13
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_1108_Tests {

    @Test
    public void test1() {
        Assert.assertEquals("1[.]1[.]1[.]1", new Solution().defangIPaddr("1.1.1.1"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("255[.]100[.]50[.]0", new Solution().defangIPaddr("255.100.50.0"));
    }
}
