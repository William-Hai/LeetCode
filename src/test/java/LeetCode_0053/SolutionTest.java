package LeetCode_0053;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 10:34 2019/03/19
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals(45, solution.maxSubArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.maxSubArray(new int[] { -1 }));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.maxSubArray(new int[] { -1, -2 }));
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.maxSubArray(new int[] { -2, 1, -3, -4, -1, -2, -1, -5, -4 }));
    }
}
