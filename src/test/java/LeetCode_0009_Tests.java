import LeetCode_0009.Solution;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_0009_Tests {

    @Test
    public void test1() {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(-2147483648);

        Assert.assertFalse(result);
    }
}
