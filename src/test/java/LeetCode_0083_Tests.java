import LeetCode_0083.ListNode;
import LeetCode_0083.Solution;
import org.junit.Assert;
import org.junit.Test;

public class LeetCode_0083_Tests {

    @Test
    public void test1() {
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(1);
        ln.next.next = new ListNode(2);

        Assert.assertEquals("1->2", output(new Solution().deleteDuplicates(ln)));
    }

    @Test
    public void test2() {
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(1);
        ln.next.next = new ListNode(2);
        ln.next.next.next = new ListNode(3);
        ln.next.next.next.next = new ListNode(3);

        Assert.assertEquals("1->2->3", output(new Solution().deleteDuplicates(ln)));
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
