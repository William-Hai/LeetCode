package LeetCode_0005;

public class Solution {
    public String longestPalindrome(String s) {

        char[] data = s.toCharArray();
        int n = s.length();
        int[][] dp = new int[n][n];

        int left = 0, right = 0, len = 0;
        for(int i = 0; i < n; i++){
            dp[i][i] = 1;
            for(int j = 0; j < i; j++){
                dp[j][i] = ((data[i] == data[j]) && ((i - j < 2) || (dp[j + 1][i - 1] == 1))) ? 1 : 0;
                if (dp[j][i] == 1 && len < i - j + 1){
                    len = i - j + 1;
                    left = j;
                    right = i;
                }
            }

        }

        return s.substring(left, right + 1);
    }
}