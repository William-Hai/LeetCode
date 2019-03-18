package LeetCode_014;

class Solution {

    String longestCommonPrefix(String[] strs) {

        if (0 == strs.length) return "";

        int i = 0;
        boolean stop = false;
        do {
            char last = '0';
            for (int j = 0; j < strs.length; j++) {
                if (i == strs[j].length()) { stop = true; break; }

                if (0 == j) {
                    if (0 == strs[j].length()) { stop = true; break; }
                    last = strs[j].charAt(i);
                    continue;
                }

                if (strs[j].charAt(i) != last) { stop = true; break; }
            }
            i++;
        } while (!stop);

        return strs[0].substring(0, i - 1);
    }
}
