import LeetCode_0961.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 13:35 2019/04/25
 */
public class LeetCode_0961_Tests {

    @Test
    public void test1() {
        Assert.assertEquals(3, new Solution().repeatedNTimes(new int[] { 1, 2, 3, 3 }));
    }

    @Test
    public void test2() {
        Assert.assertEquals(2, new Solution().repeatedNTimes(new int[] { 2, 1, 2, 5, 3, 2 }));
    }

    @Test
    public void test3() {
        Assert.assertEquals(5, new Solution().repeatedNTimes(new int[] { 5, 1, 5, 2, 5, 3, 5, 4 }));
    }
}
