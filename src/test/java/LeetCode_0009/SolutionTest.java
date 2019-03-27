package LeetCode_0009;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(-2147483648);

        Assert.assertFalse(result);
    }
}
