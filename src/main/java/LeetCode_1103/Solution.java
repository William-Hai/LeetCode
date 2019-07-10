package LeetCode_1103;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-07 10:31
 * Last Modify: 2019-07-07
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int m = getN(candies);
        int[] result = new int[num_people];
        for (int i = 0; i < m - 1; i++) {
            result[i % num_people] += (i + 1);
        }

        result[(m - 1) % num_people] += (candies - m*(m-1)/2);

        return result;
    }

    public int getN(int sum) {
        int a1 = (int) Math.sqrt(2 * sum);
        int a2 = (int) Math.sqrt(2 * sum) - 1;
        int a3 = (int) Math.sqrt(2 * sum) + 1;

        return check(sum, a1) ? a1 : check(sum, a2) ? a2 : check(sum, a3) ? a3 : 0;
    }

    private boolean check(int sum, int n) {
        return (n * (n - 1)) <= 2 * sum && 2 * sum <= (n * (n + 1));
    }
}