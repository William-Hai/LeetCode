package LeetCode_002;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();

        ListNode ln1 = new ListNode(2);
        ln1.next = new ListNode(4);
        ln1.next.next = new ListNode(3);

        ListNode ln2 = new ListNode(5);
        ln2.next = new ListNode(6);
        ln2.next.next = new ListNode(4);

        ListNode ln3 = solution.addTwoNumbers(ln1, ln2);

        Assert.assertEquals("7->0->8", output(ln3));
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
