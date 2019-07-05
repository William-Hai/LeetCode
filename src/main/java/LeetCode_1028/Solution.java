package LeetCode_1028;

import java.util.Stack;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-05 11:48
 * Last Modify: 2019-07-05
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {

    private TreeNode root = null;

    public TreeNode recoverFromPreorder(String S) {
        char[] chars = S.toCharArray();
        int deepth = 0, num = 0;
        NodeStack stack = new NodeStack();
        for (int i = 0; i < chars.length; i++) {
            if ('-' == chars[i]) {
                deepth++;
                num = 0;
                continue;
            }

            num = num * 10 + (chars[i] - '0');
            if (i == chars.length - 1 || '-' == chars[i + 1]) {
                if (null == root) {
                    root = new TreeNode(num);
                    stack.clear();
                    stack.push(root, deepth);
                } else {
                    stack.restore(deepth);
                    TreeNode node = stack.peek();
                    if (null == node.left) {
                        node.left = new TreeNode(num);
                        stack.push(node.left, deepth);
                    } else if (null == node.right) {
                        node.right = new TreeNode(num);
                        stack.push(node.right, deepth);
                    }
                }

                deepth = 0;
            }
        }

        return root;
    }

    class NodeStack {
        private Stack<TreeNode> nodes = new Stack<>();
        private Stack<Integer> deepths = new Stack<>();

        void push(TreeNode node, int deepth) {
            restore(deepth);

            nodes.push(node);
            deepths.push(deepth);
        }

        void pop() {
            deepths.pop();
            nodes.pop();
        }

        void restore(int deepth) {
            while (!deepths.isEmpty() && deepths.peek() >= deepth) {
                pop();
            }
        }

        TreeNode peek() {
            return nodes.peek();
        }

        void clear() {
            nodes.clear();
            deepths.clear();
        }
    }
}
