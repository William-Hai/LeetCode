import LeetCode_1079.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-04 10:53
 * Last Modify: 2019-07-04
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_1079_Tests {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int result = solution.numTilePossibilities("AAB");
        System.out.println(result);
        Assert.assertEquals(8, result);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int result = solution.numTilePossibilities("AAABBC");
        System.out.println(result);
        Assert.assertEquals(188, result);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int result = solution.numTilePossibilities("ABC");
        System.out.println(result);
        Assert.assertEquals(15, result);
    }
}
