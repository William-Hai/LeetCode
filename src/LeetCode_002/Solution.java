package LeetCode_002;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (null == l1 || null == l2){
            return null;
        }

        ListNode n1 = l1;
        ListNode n2 = l2;

        List<Integer> m = new ArrayList<>();
        do{
            m.add(n1.val + n2.val);
            n1 = n1.next;
            n2 = n2.next;
        }while (null != n1 && null != n2);


        while (null != n1){
            m.add(n1.val);
            n1 = n1.next;
        }
        while (null != n2){
            m.add(n2.val);
            n2 = n2.next;
        }

        int carry = 0;
        for(int i = 0; i < m.size(); i++){
            int x = (m.get(i) + carry) % 10;
            carry = (m.get(i) + carry) / 10;

            m.set(i, x);
        }

        if (carry > 0){
            m.add(carry);
        }

        ListNode result = new ListNode(0);
        ListNode tmpNode = result;
        for(int i = 0; i < m.size(); i++){
            tmpNode.val = m.get(i);
            tmpNode.next = (i == m.size() - 1) ? null : new ListNode(0);
            tmpNode = tmpNode.next;
        }

        return result;
    }
}