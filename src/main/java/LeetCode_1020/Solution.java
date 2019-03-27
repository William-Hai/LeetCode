package LeetCode_1020;

class Solution {

    boolean canThreePartsEqualSum(int[] A) {
        int sum = sum(A);
        if (0 != sum % 3) return false;

        int s1 = 0, s3;
        for (int i = 0; i < A.length - 2; i++) {
            s1 += A[i];
            if (3 * s1 != sum) continue;

            s3 = 0;
            for (int j = A.length - 1; j >= i + 2; j--) {
                s3 += A[j];
                if (3 * s3 == sum) return true;
            }
        }

        return false;
    }

    private int sum(int[] A) {
        int s = 0;
        for (int a : A) {
            s += a;
        }

        return s;
    }
}
