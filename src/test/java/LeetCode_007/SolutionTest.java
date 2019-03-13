package LeetCode_007;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int result = solution.reverse(123);

        Assert.assertEquals(321, result);
    }
}
