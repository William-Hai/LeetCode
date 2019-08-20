package LeetCode_0206;

/**
 * Create Time: 2019-08-20 16:07
 * Last Modify: 2019-08-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode head1 = null;
        while (null != node) {
            if (null == head1)
                head1 = new ListNode(node.val);
            else {
                ListNode node1 = new ListNode(node.val);
                node1.next = head1;
                head1 = node1;
            }

            node = node.next;
        }

        return head1;
    }
}