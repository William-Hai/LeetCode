package LeetCode_0709;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/4/25 0:08
 */
public class SolutionTest {

    @Test
    public void test1() {
        Assert.assertEquals("hello", new Solution().toLowerCase("Hello"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("here", new Solution().toLowerCase("here"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("lovely", new Solution().toLowerCase("LOVELY"));
    }
}
