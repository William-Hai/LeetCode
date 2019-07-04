package LeetCode_0771;

/**
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/4/24 23:52
 */
public class Solution {

    public int numJewelsInStones(String J, String S) {
        char[] charsJ = J.toCharArray();
        char[] charsS = S.toCharArray();

        int[] a = new int[128];
        for (char c : charsS) {
            a[c - 'A']++;
        }

        int sum = 0;
        for (char c : charsJ) {
            sum += a[c - 'A'];
        }

        return sum;
    }
}