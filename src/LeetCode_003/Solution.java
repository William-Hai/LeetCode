package LeetCode_003;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int[] flag = new int[256];
        java.util.Arrays.fill(flag, -1);

        int left = -1;
        for(int i = 0; i < s.length(); i++){
            left = Math.max(left, flag[s.charAt(i)]);
            flag[s.charAt(i)] = i;
            res = Math.max(res, i - left);
        }

        return res;
    }
}