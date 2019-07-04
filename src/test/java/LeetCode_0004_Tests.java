import LeetCode_0004.Solution;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_0004_Tests {

    @Test
    public void test1() {
        int[] num1 = { 1, 3 };
        int[] num2 = { 2 };

        Solution solution = new Solution();
        double result = solution.findMedianSortedArrays(num1, num2);

        Assert.assertEquals(2.0, result, 0.f);
    }
}
