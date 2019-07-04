package LeetCode_1018;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Q-WHai
 * @Date: Created in 15:31 2019/04/01
 * @Ref: https://blog.csdn.net/qq_43274298/article/details/88927741
 */
public class Solution {

    private int[][] STATUS = new int[][] {
            new int[] { 0, 2, 4, 1, 3 },
            new int[] { 1, 3, 0, 2, 4 }
    };

    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();

        int mod = 0;
        for (int item : A) {
            mod = STATUS[item][mod];
            list.add(0 == mod);
        }

        return list;
    }
}