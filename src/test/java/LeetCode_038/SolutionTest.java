package LeetCode_038;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 16:09 2019/03/19
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals("1", solution.countAndSay(1));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals("11", solution.countAndSay(2));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assert.assertEquals("21", solution.countAndSay(3));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        Assert.assertEquals("1211", solution.countAndSay(4));
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        Assert.assertEquals("111221", solution.countAndSay(5));
    }

    @Test
    public void test6() {
        Solution solution = new Solution();
        Assert.assertEquals("13112221", solution.countAndSay(7));
    }
}
