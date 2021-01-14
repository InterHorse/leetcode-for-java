package q2_AddTwoNumbers;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> list1 = new ArrayList<>(16);
        List<Integer> list2 = new ArrayList<>(16);
        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }
        int index1 = list1.size() - 1;
        int index2 = list2.size() - 1;
        ListNode headNode = null;
        ListNode pNode = null;
        ListNode tailNode = null;
        int next = 0;
        for (int i = 0; i <= Math.max(index1, index2); i++) {
            int val = 0;
            if (index1 - i >= 0) {
                val = list1.get(i);
            }
            if (index2 - i >= 0) {
                val += list2.get(i);
            }
            val += next;
            if (val >= 10) {
                val = val % 10;
                next = 1;
            } else {
                next = 0;
            }

            if (headNode == null) {
                pNode = new ListNode(val, null);
                headNode = pNode;
            } else {
                tailNode = new ListNode(val, null);
                pNode.next = tailNode;
                pNode = tailNode;
            }
        }
        if (next == 1) {
            tailNode = new ListNode(1, null);
            pNode.next = tailNode;
        }
        return headNode;
    }
}
