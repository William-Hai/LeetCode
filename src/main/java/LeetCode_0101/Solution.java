package LeetCode_0101;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Q-WHai
 * @Date: Created in 18:13 2019/04/22
 */
class Solution {
    boolean isSymmetric(TreeNode root) {
        List<Element> list = inorderTraversal(root);

        String s = output(list);
        return s.equals(new StringBuffer(s).reverse().toString());
    }

    private List<Element> inorderTraversal(TreeNode root) {
        List<Element> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    private void inorder(TreeNode node, List<Element> elements) {
        if (null == node) {
            elements.add(null);
            return;
        }

        if (null == node.left && null == node.right) {
            elements.add(new Element(node.val));
        } else {
            inorder(node.left, elements);
            elements.add(new Element(node.val));
            inorder(node.right, elements);
        }
    }

    private String output(List<Element> list) {
        String s = "";
        boolean first = true;
        for (Element e : list) {
            if (first) {
                s = String.format("%s", null == e ? "N" : e.val);
                first = false;
            } else {
                s = String.format("%s,%s", s, null == e ? "N" : e.val);
            }
        }

        return s;
    }

    class Element {
        int val;
        Element(int x) {
            val = x;
        }
    }
}
