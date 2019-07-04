package LeetCode_0929;

/**
 * @Author: Q-WHai
 * @Date: Created in 13:16 2019/04/25
 */
public class Solution {

    public int numUniqueEmails(String[] emails) {
        for (int i = 0; i < emails.length; i++) {
            emails[i] = format(emails[i]);
        }

        int count = 0;
        int[] flags = new int[emails.length];
        for (int i = 0; i < emails.length; i++) {
            boolean found = false;
            for (int j = 0; j < flags.length; j++) {
                if (1 == flags[j]) {
                    if (emails[i].equals(emails[j])) {
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                flags[i] = 1;
                count++;
            }
        }

        return count;
    }

    private String format(String email) {

        String[] segments = email.split("@");
        char[] chars = segments[0].toCharArray();
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            if ('+' == chars[i]) break;
            if ('.' == chars[i]) continue;
            s = String.format("%s%s", s, chars[i]);
        }

        return String.format("%s@%s", s, segments[1]);
    }
}