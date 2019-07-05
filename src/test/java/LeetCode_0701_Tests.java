import LeetCode_0701.Solution;
import LeetCode_0701.TreeNode;
import org.junit.Test;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-05 11:20
 * Last Modify: 2019-07-05
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0701_Tests {

    @Test
    public void test1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        {
            root.left.left = new TreeNode(1);
            root.left.right = new TreeNode(3);
        }
        root.right = new TreeNode(7);

        TreeNode node = new Solution().insertIntoBST(root, 5);
        System.out.println(node);
    }
}
