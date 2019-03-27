package LeetCode_0007;

import java.util.Arrays;

public class Solution {
    public int reverse(int x) {
        int res;
        if (x > 0){
            if (checkOverflows(x) == 0){
                return 0;
            }

            StringBuilder sb = new StringBuilder(String.valueOf(x)).reverse();
            res = Integer.valueOf(sb.toString());
        }else{
            if (checkOverflows2(x) == 0){
                return 0;
            }

            int y = x * -1;
            StringBuilder sb = new StringBuilder(String.valueOf(y)).reverse();
            res = Integer.valueOf(sb.toString());
            res *= -1;
        }

        int a = res >> 31;
        int b = x >> 31;

        return (a * b == 0) && (a + b < 0) ? 0 : res;
    }

    private int checkOverflows(int x){
        char[] maxInts = String.valueOf(Integer.MAX_VALUE).toCharArray();
        char[] xInts = String.valueOf(x).toCharArray();

        if (xInts.length < maxInts.length){
            return x;
        }

        for (int i = xInts.length - 1; i >= 0; i--) {
            if (xInts[i] > maxInts[maxInts.length - i - 1]){
                return 0;
            }
            else if (xInts[i] == maxInts[maxInts.length - i - 1]){
                continue;
            }
            else{
                return x;
            }
        }

        return x;
    }

    private int checkOverflows2(int x){
        char[] maxInts = String.valueOf(Integer.MIN_VALUE).toCharArray();
        char[] xInts = String.valueOf(x).toCharArray();

        char[] sMaxInts = Arrays.copyOfRange(maxInts, 1, maxInts.length);
        char[] sXInts = Arrays.copyOfRange(xInts, 1, xInts.length);

        if (sXInts.length < sMaxInts.length){
            return x;
        }

        for (int i = sXInts.length - 1; i >= 0; i--) {
            if (sXInts[i] > sMaxInts[sMaxInts.length - i - 1]){
                return 0;

            }
            else if (sXInts[i] == sMaxInts[sMaxInts.length - i - 1]){
                continue;
            }
            else{
                return x;
            }
        }

        return x;
    }
}