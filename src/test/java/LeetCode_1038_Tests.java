import LeetCode_1038.Solution;
import LeetCode_1038.TreeNode;
import org.junit.Test;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-03 14:51
 * Last Modify: 2019-07-03
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_1038_Tests {

    @Test
    public void test1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        {
            root.left.left = new TreeNode(0);
            root.left.right = new TreeNode(2);
            {
                root.left.right.right = new TreeNode(3);
            }
        }
        root.right = new TreeNode(6);
        {
            root.right.left = new TreeNode(5);
            root.right.right = new TreeNode(7);
            {
                root.right.right.right = new TreeNode(8);
            }
        }

        TreeNode result = new Solution().bstToGst(root);
        System.out.println(result);
    }
}
