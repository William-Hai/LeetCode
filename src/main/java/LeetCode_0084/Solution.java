package LeetCode_0084;

import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        Stack<Integer> stack1 = new Stack<Integer>(); // 原栈
        Stack<Integer> stack2 = new Stack<Integer>(); // 辅助栈

        int length = heights.length;
        stack2.push(0);
        for (int i = length - 1; i >= 0; i--) {
            stack2.push(heights[i]);
        }

        int ascCount = 0;

        while (!stack2.empty()) {
            int height = stack2.pop();
            if (stack1.empty()) {
                stack1.push(height);
                ascCount = 0;
                continue;
            }

            int top = stack1.peek();
            if (height >= top) {
                stack1.push(height);
                ascCount = 0;
                continue;
            }

            stack2.push(height);
            top = stack1.pop();
            ascCount++;
//            System.out.println(top + " x " + ascCount + " = " + (top * ascCount));
            int currentS = top * ascCount;
            if (currentS > max) {
                max = currentS;
            }
            top = height;
            stack2.push(top);
        }

        return max;
    }
}
