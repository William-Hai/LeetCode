package LeetCode_415;

public class Solution {
    public String addStrings(String num1, String num2) {
        char[] a1 = num1.toCharArray();
        char[] a2 = num2.toCharArray();

        int len = Math.max(a1.length, a2.length);
        int[] a3 = new int[len];

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = len - 1;

        for(; k >= 0; k--){
            if (i < 0 || j < 0) { break; }

            a3[k] = convert(a1[i]) + convert(a2[j]);
            i--; j--;
        }

        if (0 <= i){
            for(; k>= 0; k--) {
                if (0 > i) { break; }
                a3[k] = convert(a1[i]);
                i--;
            }
        }

        if (0 <= j){
            for(; k>= 0; k--) {
                if (0 > j) { break; }
                a3[k] = convert(a2[j]);
                j--;
            }
        }

        int carry = 0;
        for(k = len - 1; k >= 0; k--){
            a3[k] += carry;
            carry = 0;
            if (a3[k] >= 10){
                carry = a3[k] / 10;
            }

            a3[k] = a3[k] % 10;
        }

        StringBuilder sb = new StringBuilder();
        if (carry > 0){
            sb.append(carry);
        }

        for (k = 0; k < len; k++) {
            sb.append(a3[k]);
        }

        return sb.toString();
    }

    private int convert(char c) {
        return c - '0';
    }
}