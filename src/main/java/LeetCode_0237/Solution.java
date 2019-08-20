package LeetCode_0237;

/**
 * Create Time: 2019-08-20 16:36
 * Last Modify: 2019-08-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Solution {
    public void deleteNode(ListNode node) {
        if (null == node)
            return;

        ListNode last = node;

        while (null != node.next) {
            last = node;
            node.val = node.next.val;
            node = node.next;
        }

        last.next = null;
    }
}
