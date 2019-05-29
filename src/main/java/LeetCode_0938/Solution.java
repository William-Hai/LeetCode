package LeetCode_0938;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 *
 * Create Time: 2019-05-29 14:51
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
class Solution {
    int rangeSumBST(TreeNode root, int L, int R) {
        return sum(root, L, R);
    }

    private int sum(TreeNode node, int L, int R) {
        if (null == node)
            return 0;

        if (node.val < L)
            return sum(node.right, L, R);

        if (node.val > R)
            return sum(node.left, L, R);

        return node.val + sum(node.left, L, R) + sum(node.right, L, R);
    }
}