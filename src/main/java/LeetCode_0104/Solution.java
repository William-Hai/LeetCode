package LeetCode_0104;

/**
 * @Description
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 * @Author Q-WHai
 * @Date 2019/4/22 23:52
 */
class Solution {
    int maxDepth(TreeNode root) {
        return depth(root, 0);
    }

    private int depth(TreeNode node, int depth) {
        if (null == node) return depth;
        return Math.max(depth(node.left, depth + 1), depth(node.right, depth + 1));
    }
}