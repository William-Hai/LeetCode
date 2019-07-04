import LeetCode_0001.Solution;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_0001_Tests {

    @Test
    public void test1() {
        int[] indices = new Solution().twoSum(new int[]{2, 7, 11, 15}, 18);
        Assert.assertArrayEquals(indices, new int[] { 1, 2 });
    }
}
