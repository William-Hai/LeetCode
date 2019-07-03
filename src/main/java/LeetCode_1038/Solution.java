package LeetCode_1038;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-03 14:55
 * Last Modify: 2019-07-03
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode bstToGst(TreeNode root) {
        if (null == root) return null;

        List<TreeNode> list = new ArrayList<>();
        inorder(root, list);

        for (int i = 1; i < list.size(); i++) {
            list.get(i).val += list.get(i - 1).val;
        }

        return root;
    }

    private void inorder(TreeNode node, List<TreeNode> list) {
        if (null == node) return;

        inorder(node.right, list);
        list.add(node);
        inorder(node.left, list);
    }
}
