import LeetCode_0206.ListNode;
import LeetCode_0206.Solution;
import org.junit.Test;

/**
 * Create Time: 2019-08-20 16:08
 * Last Modify: 2019-08-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class LeetCode_0206_Tests {

    @Test
    public void test1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode head1 = new Solution().reverseList(head);
        System.out.println(head1);
    }
}
