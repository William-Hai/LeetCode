package LeetCode_021;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 11:37 2019/03/19
 */
public class SolutionTest {

    @Test
    public void test1() {
        ListNode ln1 = new ListNode(1);
        ln1.next = new ListNode(2);
        ln1.next.next = new ListNode(4);

        ListNode ln2 = new ListNode(1);
        ln2.next = new ListNode(3);
        ln2.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode lnm = solution.mergeTwoLists(ln1, ln2);

        Assert.assertEquals("1->1->2->3->4->4", output(lnm));
    }

    @Test
    public void test2() {
        ListNode ln2 = new ListNode(0);

        Solution solution = new Solution();
        ListNode lnm = solution.mergeTwoLists(null, ln2);

        Assert.assertEquals("0", output(lnm));
    }

    private String output(ListNode ln) {
        String s = "";
        ListNode tln = ln;
        while (null != tln) {
            s = String.format("%s%s%d", s, 0 == s.length() ? "" : "->", tln.val);
            tln = tln.next;
        }

        return s;
    }
}
