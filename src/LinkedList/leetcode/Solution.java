package LinkedList.leetcode;

/**
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 */
public class Solution {

    public static ListNode deleteNode(ListNode head, int val) {

        if (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        if (head == null) {
            return null;
        }

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }

        return head;

    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9};
        ListNode test = new ListNode(nums);
        ListNode result = deleteNode(test, 5);
        System.out.println(result);
    }
}
