import LeetCode_0069.Solution;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_0069_Tests {

    @Test
    public void test1() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.mySqrt(9));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.mySqrt(4));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.mySqrt(5));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.mySqrt(8));
    }
}
