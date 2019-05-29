package LeetCode_1022;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/5/10 20:14
 */
class Solution {
    int sumRootToLeaf(TreeNode root) {

        List<String> binarys = new ArrayList<>();
        traverse(root, String.format("%d", root.val), binarys);

        int sum = 0;
        for (String binary : binarys) {
            sum += format(binary);
        }

        return sum;
    }

    private void traverse(TreeNode node, String prefix, List<String> list) {
        if (null == node) return;

        if (null != node.left) traverse(node.left, String.format("%s%d", prefix, node.left.val), list);
        if (null != node.right) traverse(node.right, String.format("%s%d", prefix, node.right.val), list);

        if (null == node.left && null == node.right) list.add(prefix);
    }

    private int format(String binary) {
        char[] binarys = binary.toCharArray();
        int sum = 0;
        for (char c : binarys) {
            sum = (sum << 1) + (c - '0');
        }

        return sum;
    }
}