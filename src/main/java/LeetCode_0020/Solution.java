package LeetCode_0020;

class Solution {
    boolean isValid(String s) {
        char[] chars = s.toCharArray();
        MatchStack stack = new MatchStack(chars.length);
        for (char c : chars) {
            stack.add(c);
        }

        return -1 == stack.getTop();
    }
}

class MatchStack {
    private int top = -1;
    private char[] chars;
    MatchStack(int length) {
        chars = new char[length];
    }

    void add(char c) {
        if (-1 == top) {
            chars[++top] = c;
            return;
        }

        if (1 == c - chars[top] || 2 == c - chars[top]) {
            top--;
        } else {
            chars[++top] = c;
        }
    }

    int getTop() {
        return top;
    }
}