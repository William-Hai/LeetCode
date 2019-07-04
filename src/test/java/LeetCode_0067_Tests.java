import LeetCode_0067.Solution;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_0067_Tests {

    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals("100", solution.addBinary("11", "1"));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals("10101", solution.addBinary("1010", "1011"));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assert.assertEquals("1000", solution.addBinary("1", "111"));
    }
}
