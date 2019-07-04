import LeetCode_0007.Solution;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_0007_Tests {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int result = solution.reverse(123);

        Assert.assertEquals(321, result);
    }
}
