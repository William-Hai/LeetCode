import LeetCode_1013.Solution;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_1013_Tests {

    @Test
    public void test1() {
        Assert.assertTrue(new Solution().canThreePartsEqualSum(new int[] { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1 }));
    }

    @Test
    public void test2() {
        Assert.assertFalse(new Solution().canThreePartsEqualSum(new int[] { 0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1 }));
    }

    @Test
    public void test3() {
        Assert.assertTrue(new Solution().canThreePartsEqualSum(new int[] { 3, 3, 6, 5, -2, 2, 5, 1, -9, 4 }));
    }
}
