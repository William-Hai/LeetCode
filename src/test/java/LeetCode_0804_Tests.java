import LeetCode_0804.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 11:10 2019/04/25
 */
public class LeetCode_0804_Tests {

    @Test
    public void test1() {
        Assert.assertEquals(2, new Solution().uniqueMorseRepresentations(new String[] { "gin", "zen", "gig", "msg" }));
    }
}
