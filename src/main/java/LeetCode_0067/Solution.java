package LeetCode_0067;

public class Solution {
    public String addBinary(String a, String b) {
        char[] chars_a = a.length() >= b.length() ? a.toCharArray() : b.toCharArray();
        char[] chars_b = a.length() < b.length() ? a.toCharArray() : b.toCharArray();

        int[] chars_c = new int[Math.max(chars_a.length, chars_b.length)];
        for (int i = chars_a.length - 1; i >= 0; i--) {
            chars_c[i] = chars_a[i] - '0';
        }

        int overflow = 0;
        int sk = chars_c.length - chars_b.length;
        for (int i = chars_c.length - 1; i >= 0; i--) {
            int x = chars_c[i];
            int y = i - sk >= 0 ? chars_b[i - sk] - '0' : 0;

            chars_c[i] = (x + y + overflow) % 2;
            overflow = (x + y + overflow) / 2;
        }

        return output(chars_c, overflow);
    }

    private String output(int[] data, int overflow) {
        return 0 == overflow ? output(data) : String.format("%d%s", overflow, output(data));
    }

    private String output(int[] data) {
        String result = "";
        for (int d : data) {
            result = String.format("%s%d", result, d);
        }

        return result;
    }
}