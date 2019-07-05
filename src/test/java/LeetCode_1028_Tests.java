import LeetCode_1028.Solution;
import LeetCode_1028.TreeNode;
import org.junit.Test;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-05 11:49
 * Last Modify: 2019-07-05
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_1028_Tests {

    @Test
    public void test1() {
        TreeNode node = new Solution().recoverFromPreorder("1-2--3--4-5--6--7");
        System.out.println(node);
    }

    @Test
    public void test2() {
        TreeNode node = new Solution().recoverFromPreorder("1-2--3---4-5--6---7");
        System.out.println(node);
    }

    @Test
    public void test3() {
        TreeNode node = new Solution().recoverFromPreorder("1-401--349---90--88");
        System.out.println(node);
    }
}
