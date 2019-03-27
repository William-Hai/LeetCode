package LeetCode_0415;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String result = solution.addStrings("0", "0");

        Assert.assertEquals("0", result);
    }
}
