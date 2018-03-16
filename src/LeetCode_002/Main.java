package LeetCode_002;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();

        ListNode ln1 = new ListNode(2);
        ln1.next = new ListNode(4);
        ln1.next.next = new ListNode(3);

        ListNode ln2 = new ListNode(5);
        ln2.next = new ListNode(6);
        ln2.next.next = new ListNode(4);

        ListNode ln3 = solution.addTwoNumbers(ln1, ln2);
        System.out.println(ln3);
    }
}
