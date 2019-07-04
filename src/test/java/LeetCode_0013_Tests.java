import LeetCode_0013.Solution;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_0013_Tests {

    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.romanToInt("IV"));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assert.assertEquals(9, solution.romanToInt("IX"));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        Assert.assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        Assert.assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}
