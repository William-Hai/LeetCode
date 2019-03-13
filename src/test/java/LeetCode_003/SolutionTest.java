package LeetCode_003;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("abcabcbb");

        Assert.assertEquals(result, 3);
    }
}
