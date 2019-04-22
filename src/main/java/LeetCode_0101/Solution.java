package LeetCode_0101;

/**
 * @Author: Q-WHai
 * @Date: Created in 18:13 2019/04/22
 */
class Solution {

    boolean isSymmetric(TreeNode root) {
        if (null == root) return true;

        return adjust(root.left, root.right);
    }

    private boolean adjust(TreeNode n1, TreeNode n2) {
        if (null == n1 && null == n2) return true;
        else if (null == n1 || null == n2) return false;
        else if (n1.val != n2.val) return false;

        return adjust(n1.left, n2.right) && adjust(n1.right, n2.left);
    }
}
