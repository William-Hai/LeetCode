package LeetCode_0155;

import java.util.Stack;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-28 10:49
 * Last Modify: 2019-05-28
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
class MinStack {

    private Stack<Integer> stack = new Stack<>();       // 实际栈
    private Stack<Integer> minStack = new Stack<>();    // 最小数值下标栈

    /** initialize your data structure here. */
    public MinStack() { }

    void push(int x) {
        stack.push(x);
        if (minStack.empty() || stack.get(minStack.peek()) >= x)
            minStack.push(stack.size() - 1);
    }

    void pop() {
        int size = stack.size();
        stack.pop();

        if (size - 1 == minStack.peek())
            minStack.pop();
    }

    int top() {
        return stack.peek();
    }

    int getMin() {
        return stack.get(minStack.peek());
    }
}

/*
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */