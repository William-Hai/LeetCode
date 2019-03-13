package LeetCode_005;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String result = solution.longestPalindrome("babad");

        Assert.assertEquals("bab", result);
    }
}
