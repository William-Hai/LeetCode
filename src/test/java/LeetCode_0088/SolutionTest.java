package LeetCode_0088;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        int[] num1 = new int[]{ 1, 2, 3, 0, 0, 0 };
        int[] num2 = new int[]{ 2, 5, 6 };
        int[] num3 = new int[] { 1, 2, 2, 3, 5, 6 };

        Solution solution = new Solution();
        solution.merge(num1, 3, num2, 3);

        for (int j = 0; j < num3.length; j++) {
            Assert.assertEquals(num3[j], num1[j]);
        }
    }

    @Test
    public void test2() {
        int[] num1 = new int[]{ 1, 2, 3, 0, 0, 0 };
        int[] num2 = new int[]{ 2, 5, 6 };
        int[] num3 = new int[] { 1, 2, 2, 5, 6 };

        Solution solution = new Solution();
        solution.merge(num1, 2, num2, 3);

        for (int j = 0; j < num3.length; j++) {
            Assert.assertEquals(num3[j], num1[j]);
        }
    }
}
