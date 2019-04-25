package LeetCode_0929;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 13:16 2019/04/25
 */
public class SolutionTest {

    @Test
    public void test1() {
        Assert.assertEquals(2, new Solution().numUniqueEmails(new String[] {
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
        }));
    }
}
