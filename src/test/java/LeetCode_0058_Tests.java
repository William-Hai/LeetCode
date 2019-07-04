import LeetCode_0058.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 11:26 2019/03/19
 */
public class LeetCode_0058_Tests {

    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.lengthOfLastWord("Hello World "));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.lengthOfLastWord(" "));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.lengthOfLastWord(""));
    }
}
