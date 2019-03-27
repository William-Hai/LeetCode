package LeetCode_1020;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Assert.assertTrue(new Solution().canThreePartsEqualSum(new int[] { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1 }));
    }

    @Test
    public void test2() {
        Assert.assertFalse(new Solution().canThreePartsEqualSum(new int[] { 0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1 }));
    }

    @Test
    public void test3() {
        Assert.assertTrue(new Solution().canThreePartsEqualSum(new int[] { 3, 3, 6, 5, -2, 2, 5, 1, -9, 4 }));
    }
}
