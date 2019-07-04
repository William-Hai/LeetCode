import LeetCode_0415.Solution;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_0415_Tests {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String result = solution.addStrings("0", "0");

        Assert.assertEquals("0", result);
    }
}
