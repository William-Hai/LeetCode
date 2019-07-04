import LeetCode_1018.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @Author: Q-WHai
 * @Date: Created in 15:32 2019/04/01
 */
public class LeetCode_1018_Tests {

    @Test
    public void test1() {
        Solution solution = new Solution();
        List<Boolean> result = solution.prefixesDivBy5(new int[] { 0, 1, 1 });
        Assert.assertTrue(result.get(0));
        Assert.assertFalse(result.get(1));
        Assert.assertFalse(result.get(2));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        List<Boolean> result = solution.prefixesDivBy5(new int[] { 1, 1, 1 });
        Assert.assertFalse(result.get(0));
        Assert.assertFalse(result.get(1));
        Assert.assertFalse(result.get(2));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        List<Boolean> result = solution.prefixesDivBy5(new int[] { 0, 1, 1, 1, 1, 1 });
        Assert.assertTrue(result.get(0));
        Assert.assertFalse(result.get(1));
        Assert.assertFalse(result.get(2));
        Assert.assertFalse(result.get(3));
        Assert.assertTrue(result.get(4));
        Assert.assertFalse(result.get(5));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        List<Boolean> result = solution.prefixesDivBy5(new int[] { 1, 1, 1, 0, 1 });
        Assert.assertFalse(result.get(0));
        Assert.assertFalse(result.get(1));
        Assert.assertFalse(result.get(2));
        Assert.assertFalse(result.get(3));
        Assert.assertFalse(result.get(4));
    }

    @Test
    public void test5() {
        // [1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1]
        Solution solution = new Solution();
        List<Boolean> result = solution.prefixesDivBy5(new int[] { 1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1 });
        Assert.assertFalse(result.get(0));
        Assert.assertFalse(result.get(1));
        Assert.assertFalse(result.get(2));
        Assert.assertFalse(result.get(3));
        Assert.assertFalse(result.get(4));
        Assert.assertFalse(result.get(5));
        Assert.assertFalse(result.get(6));
        Assert.assertFalse(result.get(7));
        Assert.assertFalse(result.get(8));
        Assert.assertFalse(result.get(9));
        Assert.assertFalse(result.get(10));
        Assert.assertFalse(result.get(11));
        Assert.assertFalse(result.get(12));
        Assert.assertFalse(result.get(13));
        Assert.assertFalse(result.get(14));
        Assert.assertFalse(result.get(15));
        Assert.assertFalse(result.get(16));
        Assert.assertFalse(result.get(17));
        Assert.assertFalse(result.get(18));
        Assert.assertFalse(result.get(19));
        Assert.assertFalse(result.get(20));
        Assert.assertFalse(result.get(21));
        Assert.assertFalse(result.get(22));
        Assert.assertFalse(result.get(23));
        Assert.assertFalse(result.get(24));
        Assert.assertFalse(result.get(25));
        Assert.assertFalse(result.get(26));
        Assert.assertFalse(result.get(27));
        Assert.assertFalse(result.get(28));
        Assert.assertFalse(result.get(29));
        Assert.assertFalse(result.get(30));
        Assert.assertTrue(result.get(31));
        Assert.assertFalse(result.get(32));
        Assert.assertFalse(result.get(33));
        Assert.assertTrue(result.get(34));
        Assert.assertTrue(result.get(35));
        Assert.assertTrue(result.get(36));
        Assert.assertTrue(result.get(37));
        Assert.assertFalse(result.get(38));
    }
}
