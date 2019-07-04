import LeetCode_1022.Solution;
import LeetCode_1022.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/5/10 20:16
 */
public class LeetCode_1022_Tests {

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        {
            root.left = new TreeNode(0);
            {
                root.left.left = new TreeNode(0);
                root.left.right = new TreeNode(1);
            }
            root.right = new TreeNode(1);
            {
                root.right.left = new TreeNode(0);
                root.right.right = new TreeNode(1);
            }
        }

        Assert.assertEquals(22, new Solution().sumRootToLeaf(root));
    }
}
