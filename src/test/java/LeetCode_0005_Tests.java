import LeetCode_0005.Solution;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_0005_Tests {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String result = solution.longestPalindrome("babad");

        Assert.assertEquals("bab", result);
    }
}
