import LeetCode_0771.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/4/24 23:52
 */
public class LeetCode_0771_Tests {

    @Test
    public void test1() {
        Assert.assertEquals(3, new Solution().numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(0, new Solution().numJewelsInStones("z", "ZZ"));
    }
}
