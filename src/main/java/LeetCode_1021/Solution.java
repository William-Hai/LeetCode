package LeetCode_1021;

/**
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/4/25 0:17
 */
public class Solution {

    public String removeOuterParentheses(String S) {
        char[] chars = S.toCharArray();
        int[] flags = new int[chars.length];
        int a = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                a++;
                if (1 == a) flags[i] = 1;
            } else {
                a--;
                if (0 == a) flags[i] = 1;
            }
        }

        String result = "";
        for (int i = 0; i < flags.length; i++) {
            if (0 == flags[i]) result += String.valueOf(chars[i]);
        }

        return result;
    }
}