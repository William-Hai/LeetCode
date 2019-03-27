package LeetCode_0001;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        int[] indices = new Solution().twoSum(new int[]{2, 7, 11, 15}, 18);
        Assert.assertArrayEquals(indices, new int[] { 1, 2 });
    }
}
