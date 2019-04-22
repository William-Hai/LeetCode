package LeetCode_0100;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 17:31 2019/04/22
 */
public class SolutionTest {

    @Test
    public void test1() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        Solution solution = new Solution();
        Assert.assertTrue(solution.isSameTree(p, q));
    }

    @Test
    public void test2() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);

        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(2);

        Solution solution = new Solution();
        Assert.assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void test3() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(1);
        q.right = new TreeNode(2);

        Solution solution = new Solution();
        Assert.assertFalse(solution.isSameTree(p, q));
    }
}
