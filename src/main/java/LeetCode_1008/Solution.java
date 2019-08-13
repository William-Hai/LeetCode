package LeetCode_1008;

/**
 * Create Time: 2019-08-13 14:34
 * Last Modify: 2019-08-13
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    private TreeNode root = null;

    public TreeNode bstFromPreorder(int[] preorder) {
        for (int val : preorder) {
            insert(val);
        }

        return root;
    }

    private void insert(int val) {
        if (null == root) {
            root = new TreeNode(val);
            return;
        }

        insert(root, val);
    }

    private void insert(TreeNode node, int val) {
        if (val < node.val) {
            if (null == node.left) {
                node.left = new TreeNode(val);
                return;
            }
            insert(node.left, val);
        } else {
            if (null == node.right) {
                node.right = new TreeNode(val);
                return;
            }
            insert(node.right, val);
        }
    }
}
