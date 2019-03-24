package LeetCode_069;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.mySqrt(9));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.mySqrt(4));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.mySqrt(5));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.mySqrt(8));
    }
}
