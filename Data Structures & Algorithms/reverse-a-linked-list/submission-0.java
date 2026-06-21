/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            if (node.next == null) {
                stack.push(node.val);
                break;
            }
            stack.push(node.val);
            node = node.next;
        }
        ListNode res = new ListNode(0);
        ListNode temp = res;
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            temp.next = new ListNode(stack.pop());
            temp = temp.next;
        }
        return res.next;
    }
}
