package LeetCode_038;

/**
 * @Author: Q-WHai
 * @Date: Created in 16:09 2019/03/19
 */
class Solution {
    String countAndSay(int n) {
        if (1 == n) return "1";
        String last = "1";
        for (int i = 2; i <= n; i++) {
            last = next(last);
        }
        return last;
    }

    private String next(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        char last = chars[0];
        String result = "";
        String m = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == last) {
                count++;
                m = String.format("%d%s", count, last);
            } else {
                result = String.format("%s%s", result, m);
                last = chars[i];
                count = 1;
                m = String.format("%d%s", count, last);
            }
        }

        return String.format("%s%s", result, m);
    }
}