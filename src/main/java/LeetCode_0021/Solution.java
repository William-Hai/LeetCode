package LeetCode_0021;

/**
 * @Author: Q-WHai
 * @Date: Created in 11:37 2019/03/19
 */
class Solution {
    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode n1 = l1;
        ListNode n2 = l2;

        ListNode lnm = null;
        while (null != n1 && null != n2) {
            ListNode tln;
            if (n1.val <= n2.val) {
                tln = new ListNode(n1.val);
                n1 = n1.next;
            } else {
                tln = new ListNode(n2.val);
                n2 = n2.next;
            }

            lnm = append(lnm, tln);
        }

        lnm = append(lnm, n1);
        lnm = append(lnm, n2);

        return lnm;
    }

    private ListNode append(ListNode ln, ListNode x) {
        if (null == x) return ln;
        if (null == ln) {
            ln = x;
            return ln;
        }

        ListNode tln = ln;
        while (null != tln.next) {
            tln = tln.next;
        }

        tln.next = x;

        return ln;
    }
}