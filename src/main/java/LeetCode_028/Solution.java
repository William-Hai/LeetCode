package LeetCode_028;

/**
 * @Author: Q-WHai
 * @Date: Created in 15:09 2019/03/19
 */
class Solution {
    int strStr(String haystack, String needle) {
        if (null == haystack || null == needle) return -1;
        int hlen = haystack.length();
        int nlen = needle.length();
        if (nlen > hlen) return -1;

        for (int i = 0; i < hlen - nlen + 1; i++) {
            if (needle.equals(haystack.substring(i, i + nlen))) return i;
        }

        return haystack.equals(needle) ? 0 : -1;
    }
}