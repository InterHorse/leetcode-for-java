package q2_AddTwoNumbers;

/**
 * @author InterHorse
 * @date 2021-01-15 00:30:02
 * <p>
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * https://leetcode-cn.com/problems/add-two-numbers/
 */

class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pL1 = l1;
        ListNode pL2 = l2;
        ListNode headNode = null;
        ListNode pNode = null;
        ListNode tailNode;
        int next = 0;
        while (pL1 != null || pL2 != null) {
            int val = 0;
            if (pL1 != null) {
                val += pL1.val;
                pL1 = pL1.next;
            }
            if (pL2 != null) {
                val += pL2.val;
                pL2 = pL2.next;
            }
            val += next;
            if (val >= 10) {
                val = val % 10;
                next = 1;
            } else {
                next = 0;
            }
            if (headNode == null) {
                pNode = new ListNode(val);
                headNode = pNode;
            } else {
                tailNode = new ListNode(val);
                pNode.next = tailNode;
                pNode = tailNode;
            }
        }
        if (next == 1) {
            tailNode = new ListNode(1);
            pNode.next = tailNode;
        }
        return headNode;
    }
}
