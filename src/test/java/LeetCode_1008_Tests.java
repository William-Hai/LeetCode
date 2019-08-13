import LeetCode_1008.Solution;
import LeetCode_1008.TreeNode;
import org.junit.Test;

/**
 * Create Time: 2019-08-13 14:56
 * Last Modify: 2019-08-13
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_1008_Tests {

    @Test
    public void test1() {
        TreeNode node = new Solution().bstFromPreorder(new int[] { 8,5,1,7,10,12 });
        System.out.println(node);
    }
}
