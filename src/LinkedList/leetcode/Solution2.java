package LinkedList.leetcode;

/**
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 * 使用虚拟头结点
 */
public class Solution2 {

    public static ListNode deleteNode(ListNode head, int val) {
        ListNode dummyListNode = new ListNode(-1);
        dummyListNode.next = head;
        ListNode prev = dummyListNode;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }

        return dummyListNode.next;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9};
        ListNode test = new ListNode(nums);
        ListNode result = deleteNode(test, 5);
        System.out.println(result);
    }
}
