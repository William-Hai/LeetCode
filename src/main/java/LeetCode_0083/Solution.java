package LeetCode_0083;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    ListNode deleteDuplicates(ListNode head) {
        ListNode last = null;
        ListNode currNode = head;
        boolean first = true;
        while (null != currNode) {
            if (first) {
                last = currNode;
                first = false;
                currNode = currNode.next;
                continue;
            }

            if (currNode.val != last.val) {
                last = currNode;
                currNode = currNode.next;
            } else {
                last.next = currNode.next;
                currNode = currNode.next;
            }
        }

        return head;
    }
}