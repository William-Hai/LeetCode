package LeetCode_008;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 18:02 2019/03/19
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals(42, solution.myAtoi("42"));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals(-42, solution.myAtoi("   -42"));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assert.assertEquals(4193, solution.myAtoi("4193 with words"));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.myAtoi("words and 987"));
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        Assert.assertEquals(-2147483648, solution.myAtoi("-91283472332"));
    }

    @Test
    public void test6() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.myAtoi("-000000000000001"));
    }

    @Test
    public void test7() {
        Solution solution = new Solution();
        Assert.assertEquals(12345678, solution.myAtoi("  0000000000012345678"));
    }

    @Test
    public void test8() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.myAtoi("+1"));
    }

    @Test
    public void test9() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.myAtoi("-"));
    }

    @Test
    public void test10() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.myAtoi("-+1"));
    }
}
