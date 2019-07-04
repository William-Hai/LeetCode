import LeetCode_0209.Solution;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_0209_Tests {

    @Test
    public void test1() {
        int s = 7;
        int[] nums = { 2, 3, 1, 2, 4, 3 };

        Solution solution = new Solution();
        int result = solution.minSubArrayLen(s, nums);

        Assert.assertEquals(2, result);
    }
}
