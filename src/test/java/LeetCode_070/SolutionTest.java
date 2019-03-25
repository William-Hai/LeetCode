package LeetCode_070;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test(timeout = 10)
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.climbStairs(0));
    }

    @Test(timeout = 10)
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.climbStairs(1));
    }

    @Test(timeout = 10)
    public void test3() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.climbStairs(2));
    }

    @Test(timeout = 10)
    public void test4() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.climbStairs(3));
    }

    @Test(timeout = 10)
    public void test5() {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.climbStairs(4));
    }

    @Test(timeout = 10)
    public void test6() {
        Solution solution = new Solution();
        Assert.assertEquals(1836311903, solution.climbStairs(45));
    }
}
