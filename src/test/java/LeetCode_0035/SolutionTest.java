package LeetCode_0035;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 15:57 2019/03/19
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 5));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 2));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 7));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 0));
    }
}
