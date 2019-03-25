package LeetCode_070;

class Solution {

    private int[] steps = new int[1000];

    int climbStairs(int n) {
        steps[0] = 0;
        steps[1] = 1;
        steps[2] = 2;

        return 2 >= n ? steps[n] : stairs(n - 1) + stairs(n - 2);
    }

    private int stairs(int n) {
        if (2 >= n) return steps[n];

        if (0 == steps[n - 1]) steps[n - 1] = stairs(n - 1);
        if (0 == steps[n - 2]) steps[n - 2] = stairs(n - 2);

        return steps[n - 1] + steps[n - 2];
    }
}
