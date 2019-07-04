import LeetCode_0104.Solution;
import LeetCode_0104.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/4/22 23:53
 */
public class LeetCode_0104_Tests {

    /**
     *   3
     *  / \
     * 9  20
     *   /  \
     *  15   7
     *
     */
    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Assert.assertEquals(3, new Solution().maxDepth(root));
    }
}
