import LeetCode_1103.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-07 10:32
 * Last Modify: 2019-07-07
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_1103_Tests {

    @Test
    public void test1() {
        Assert.assertEquals(4, new Solution().getN(7));
    }

    @Test
    public void test2() {
        Assert.assertEquals(99, new Solution().getN(4900));
    }

    @Test
    public void test3() {
        int[] result = new Solution().distributeCandies(7, 4);
        System.out.println(result);
    }

    @Test
    public void test4() {
        int[] result = new Solution().distributeCandies(10, 3);
        System.out.println(result);
    }
}
