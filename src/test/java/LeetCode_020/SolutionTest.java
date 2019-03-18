package LeetCode_020;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isValid("()"));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assert.assertFalse(solution.isValid("(]"));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        Assert.assertFalse(solution.isValid("([)]"));
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isValid("{[]}"));
    }
}
