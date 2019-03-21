package LeetCode_066;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals("[1, 2, 4]", Arrays.toString(solution.plusOne(new int[] { 1, 2, 3 })));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals("[4, 3, 2, 2]", Arrays.toString(solution.plusOne(new int[] { 4, 3, 2, 1 })));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assert.assertEquals("[1]", Arrays.toString(solution.plusOne(new int[] {})));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        Assert.assertEquals("[1, 0, 0]", Arrays.toString(solution.plusOne(new int[] { 9, 9 })));
    }
}
