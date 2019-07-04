package LeetCode_0807;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-01 15:15
 * Last Modify: 2019-07-01
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowHeights = new int[grid.length];
        int[] colHeights = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                rowHeights[i] = rowHeights[i] < grid[i][j] ? grid[i][j] : rowHeights[i];
                colHeights[j] = colHeights[j] < grid[i][j] ? grid[i][j] : colHeights[j];
            }
        }

        int sum = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += (min(colHeights[i], rowHeights[j]) - grid[i][j]);
            }
        }

        return sum;

    }

    private int min(int a, int b) {
        return a < b ? a : b;
    }
}
