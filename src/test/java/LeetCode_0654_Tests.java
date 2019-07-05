import LeetCode_0654.Solution;
import LeetCode_0654.TreeNode;
import org.junit.Test;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-05 10:14
 * Last Modify: 2019-07-05
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0654_Tests {

    @Test
    public void test1() {
        TreeNode node = new Solution().constructMaximumBinaryTree(new int[]{ 3, 2, 1, 6, 0, 5 });
        System.out.println(node);
    }
}
