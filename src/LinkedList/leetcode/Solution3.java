package LinkedList.leetcode;


import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
public class Solution3 {

    public static int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode dummyListNode = new ListNode(-1);
        dummyListNode.next = head;
        ListNode pre = dummyListNode;
        while (pre.next != null) {
            stack.push(pre.next);
            pre = pre.next;
        }
        int[] nums = new int[stack.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = stack.pop().val;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 8};
        ListNode listNode = new ListNode(nums);
        int[] ints = reversePrint(listNode);
        for (int a : ints) {
            System.out.print(a + " ");
        }
    }
}
