package LeetCode_0100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Q-WHai
 * @Date: Created in 17:28 2019/04/22
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Element> list1 = preorderTraversal(p);
        List<Element> list2 = preorderTraversal(q);

        return output(list1).equals(output(list2));
    }

    private List<Element> preorderTraversal(TreeNode root) {
        List<Element> list = new ArrayList<>(); // 保存结果list
        preorder(root, list);
        return list;
    }

    private void preorder(TreeNode node, List<Element> elements) {
        if (null == node) {
            elements.add(null);
            return;
        }

        elements.add(new Element(node.val));
        preorder(node.left, elements);
        preorder(node.right, elements);
    }

    private String output(List<Element> list) {
        String s = "";
        for (Element e : list) {
            s = String.format("%s,%s", s, null == e ? "" : e.val);
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