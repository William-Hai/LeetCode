package LeetCode_0877;

/**
 * 注解：
 * dp(i,j) = max(piles[i] + dp(i+1, j), piles[j] + dp[i][j-1]);
 *
 * <p>
 * Create Time: 2019-07-01 16:29
 * Last Modify: 2019-07-01
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {

    private int[] piles = null;
    private int[][] dp = null;

    public boolean stoneGame(int[] piles) {
        this.piles = piles;
        this.dp = new int[piles.length][piles.length];

        return dp(0, this.piles.length - 1) > 0;
    }

    private int dp(int i, int j) {
        if (i > j || i + 1 >= piles.length || j - 1 < 0) return 0;

        dp[i + 1][j] = dp[i + 1][j] > 0 ? dp[i + 1][j] : dp(i + 1, j);
        dp[i][j - 1] = dp[i][j - 1] > 0 ? dp[i][j - 1] : dp(i, j - 1);

        return max(piles[i] + dp[i + 1][j], piles[j] + dp[i][j - 1]);
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }
}
