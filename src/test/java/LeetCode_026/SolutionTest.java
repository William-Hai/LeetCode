package LeetCode_026;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 14:16 2019/03/19
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.removeDuplicates(new int[] { 1, 1, 2 }));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.removeDuplicates(new int[] { 0 }));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.removeDuplicates(new int[] { 0, 0 }));
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.removeDuplicates(new int[] { 1, 1, 2 }));
    }
}
