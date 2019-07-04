import LeetCode_0003.Solution;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_0003_Tests {

    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }
}
