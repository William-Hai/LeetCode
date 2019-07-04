import LeetCode_0028.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 15:09 2019/03/19
 */
public class LeetCode_0028_Tests {

    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.strStr("Hello", "ll"));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.strStr("aaaaa", "bba"));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.strStr("aaaaa", ""));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.strStr(null, "bba"));
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.strStr("aaaaa", null));
    }

    @Test
    public void test6() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.strStr("", "bba"));
    }

    @Test
    public void test7() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.strStr("aa", "aaa"));
    }

    @Test
    public void test8() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.strStr("aa", "aa"));
    }

    @Test
    public void test9() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.strStr("", ""));
    }

    @Test
    public void test10() {
        Solution solution = new Solution();
        Assert.assertEquals(9, solution.strStr("mississippi", "pi"));
    }
}
