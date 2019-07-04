import LeetCode_0027.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 14:36 2019/03/19
 */
public class LeetCode_0027_Tests {

    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.removeElement(new int[] { 3, 2, 2, 3 }, 3));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));
    }
}
