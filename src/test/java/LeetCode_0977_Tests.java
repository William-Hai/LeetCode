import LeetCode_0977.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * Create Time: 2019-08-16 14:52
 * Last Modify: 2019-08-16
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0977_Tests {

    @Test
    public void test1() {
        int[] actual = new Solution().sortedSquares(new int[] { -4,-1,0,3,10 });
        int[] expected = { 0,1,9,16,100 };
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test2() {
        int[] actual = new Solution().sortedSquares(new int[] { -7,-3,2,3,11 });
        int[] expected = { 4,9,9,49,121 };
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test3() {
        int[] actual = new Solution().sortedSquares(new int[] { -1 });
        int[] expected = { 1 };
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test4() {
        int[] actual = new Solution().sortedSquares(new int[] { -2 });
        int[] expected = { 4 };
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], actual[i]);
        }
    }
}
