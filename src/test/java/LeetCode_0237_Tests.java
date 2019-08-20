import LeetCode_0237.ListNode;
import LeetCode_0237.Solution;
import org.junit.Test;

/**
 * Create Time: 2019-08-20 16:37
 * Last Modify: 2019-08-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0237_Tests {

    @Test
    public void test1() {
        ListNode node = new ListNode(4);
        node.next = new ListNode(5);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(9);

        new Solution().deleteNode(node.next);
    }

    @Test
    public void test2() {
        ListNode node = new ListNode(4);
        node.next = new ListNode(5);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(9);

        new Solution().deleteNode(node.next.next);
        System.out.println(node);
    }

    @Test
    public void test3() {
        ListNode node = new ListNode(4);
        node.next = new ListNode(5);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(9);

        new Solution().deleteNode(node);
        System.out.println(node);
    }
}
