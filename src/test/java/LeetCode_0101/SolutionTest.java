package LeetCode_0101;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 18:15 2019/04/22
 */
public class SolutionTest {

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        {
            root.left = new TreeNode(2);
            {
                root.left.left = new TreeNode(3);
                root.left.right = new TreeNode(4);
            }

            root.right = new TreeNode(2);
            {
                root.right.left = new TreeNode(4);
                root.right.right = new TreeNode(3);
            }
        }

        Assert.assertTrue(new Solution().isSymmetric(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);
        {
            root.left = new TreeNode(2);
            {
                root.left.right = new TreeNode(3);
            }

            root.right = new TreeNode(2);
            {
                root.right.right = new TreeNode(3);
            }
        }

        Assert.assertFalse(new Solution().isSymmetric(root));
    }

    @Test
    public void test3() {
        //[1,2,3,3,null,2,null]
        TreeNode root = new TreeNode(1);
        {
            root.left = new TreeNode(2);
            {
                root.left.left = new TreeNode(3);
            }

            root.right = new TreeNode(3);
            {
                root.right.left = new TreeNode(2);
            }
        }

        Assert.assertFalse(new Solution().isSymmetric(root));
    }
}
