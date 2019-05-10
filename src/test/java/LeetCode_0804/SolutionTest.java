package LeetCode_0804;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 11:10 2019/04/25
 */
public class SolutionTest {

    @Test
    public void test1() {
        Assert.assertEquals(2, new Solution().uniqueMorseRepresentations(new String[] { "gin", "zen", "gig", "msg" }));
    }
}
