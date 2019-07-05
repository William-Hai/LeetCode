package LeetCode_0701;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-05 11:19
 * Last Modify: 2019-07-05
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (null == root)
            return null;

        insert(root, val);
        return root;
    }

    private void insert(TreeNode node, int val) {
        if (val < node.val) {
            if (null == node.left)
                node.left = new TreeNode(val);
            else
                insert(node.left, val);
        } else if (val > node.val) {
            if (null == node.right)
                node.right = new TreeNode(val);
            else
                insert(node.right, val);
        }
    }
}
