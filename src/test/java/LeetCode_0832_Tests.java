import LeetCode_0832.Solution;
import org.junit.Assert;
import org.junit.Test;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 15:59
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0832_Tests {

    @Test
    public void test1() {
        int a = 1;
        int b = 0;

        Assert.assertEquals(0, a ^ 1);
        Assert.assertEquals(1, b ^ 1);
    }

    @Test
    public void test2() {
        int[][] input = new int[][] {
                new int[] { 1, 1, 0 },
                new int[] { 1, 0, 1 },
                new int[] { 0, 0, 0 }
        };

        int[][] output = new int[][] {
                new int[] { 1, 0, 0 },
                new int[] { 0, 1, 0 },
                new int[] { 1, 1, 1 }
        };

        Assert.assertTrue(equals(output, new Solution().flipAndInvertImage(input)));
    }

    private boolean equals(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != b[i][j])
                    return false;
            }
        }

        return true;
    }
}
