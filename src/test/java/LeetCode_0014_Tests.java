import LeetCode_0014.Solution;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_0014_Tests {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String[] input = new String[] { "flower", "flow", "flight" };
        Assert.assertEquals("fl", solution.longestCommonPrefix(input));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String[] input = new String[] { "dog", "racecar", "car" };
        Assert.assertEquals("", solution.longestCommonPrefix(input));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String[] input = new String[] { };
        Assert.assertEquals("", solution.longestCommonPrefix(input));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        String[] input = new String[] { "" };
        Assert.assertEquals("", solution.longestCommonPrefix(input));
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        String[] input = new String[] { "a" };
        Assert.assertEquals("a", solution.longestCommonPrefix(input));
    }

    @Test
    public void test6() {
        Solution solution = new Solution();
        String[] input = new String[] { "c", "c" };
        Assert.assertEquals("c", solution.longestCommonPrefix(input));
    }

    @Test
    public void test7() {
        Solution solution = new Solution();
        String[] input = new String[] { "abc", "ab" };
        Assert.assertEquals("ab", solution.longestCommonPrefix(input));
    }
}
