package LeetCode_0709;

/**
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/4/25 0:07
 */
public class Solution {

    public String toLowerCase(String str) {
        char[] a = str.toCharArray();
        for (int i = a.length - 1; i >= 0; i--) {
            if ('A' <= a[i] && a[i] <= 'Z') {
                a[i] = (char)(a[i] - 'A' + 'a');
            }
        }

        return String.valueOf(a);
    }
}
