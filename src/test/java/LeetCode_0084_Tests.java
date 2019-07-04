import LeetCode_0084.Solution;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_0084_Tests {

    @Test
    public void test1() {
        int[] array = { 2, 1, 5, 6, 2, 3 };

        Solution solution = new Solution();
        int result = solution.largestRectangleArea(array);

        Assert.assertEquals(10, result);
    }
}
