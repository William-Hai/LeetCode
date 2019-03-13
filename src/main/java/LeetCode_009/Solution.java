package LeetCode_009;

public class Solution {
    public boolean isPalindrome(int x) {
        return x >= 0 && String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
    }
}