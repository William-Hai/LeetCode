package LeetCode_0043;

public class Solution {

    public String multiply(String num1, String num2) {
        int[] a1 = convert(num1);
        int[] a2 = convert(num2);

        int[] a3 = new int[a1.length + a2.length];

        for (int i = a1.length - 1; i >= 0; i--) {
            for (int j = a2.length - 1; j >= 0; j--) {
                if (0 > i || 0 > j) { break; }
                a3[i + j + 1] += a1[i] * a2[j];
            }
        }

        int carry = 0;
        for (int i = a3.length - 1; i >= 0; i--) {
            a3[i] += carry;
            carry = a3[i] / 10;
            a3[i] = a3[i] % 10;
        }

        return convert(a3);
    }

    private String convert(int[] array){
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (0 != array[i]) {
                flag = false;
            }

            if (array[i] == 0 && flag){
                continue;
            }

            sb.append(array[i]);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    private int[] convert(String num){
        char[] a1 = num.toCharArray();
        int[] a2 = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            a2[i] = convert(a1[i]);
        }

        return a2;
    }

    private int convert(char c) {
        return c - '0';
    }
}
