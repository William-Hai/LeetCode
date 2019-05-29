package LeetCode_0938;

import org.junit.Assert;
import org.junit.Test;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-29 14:51
 * Last Modify: 2019-05-29
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class SolutionTests {

    @Test
    public void test1() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        {
            root.left.left = new TreeNode(3);
            root.left.right = new TreeNode(7);
        }
        root.right = new TreeNode(15);
        {
            root.right.right = new TreeNode(18);
        }

        Assert.assertEquals(32, new Solution().rangeSumBST(root, 7, 15));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        {
            root.left.left = new TreeNode(3);
            {
                root.left.left.left = new TreeNode(1);
            }
            root.left.right = new TreeNode(7);
            {
                root.left.right.left = new TreeNode(6);
            }
        }
        root.right = new TreeNode(15);
        {
            root.right.left = new TreeNode(13);
            root.right.right = new TreeNode(18);
        }

        Assert.assertEquals(23, new Solution().rangeSumBST(root, 6, 10));
    }
}
