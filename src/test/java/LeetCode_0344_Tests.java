import LeetCode_0344.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * Create Time: 2019-08-20 15:29
 * Last Modify: 2019-08-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0344_Tests {

    @Test
    public void test1() {
        char[] input = new char[] { 'h','e','l','l','o' };
        new Solution().reverseString(input);

        char[] expected = { 'o','l','l','e','h' };
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], input[i]);
        }
    }

    @Test
    public void test2() {
        char[] input = new char[] { 'H','a','n','n','a','h' };
        new Solution().reverseString(input);

        char[] expected = { 'h','a','n','n','a','H' };
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], input[i]);
        }
    }
}
