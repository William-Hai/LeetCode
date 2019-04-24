package LeetCode_0771;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/4/24 23:52
 */
public class SolutionTest {

    @Test
    public void test1() {
        Assert.assertEquals(3, new Solution().numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(0, new Solution().numJewelsInStones("z", "ZZ"));
    }
}
