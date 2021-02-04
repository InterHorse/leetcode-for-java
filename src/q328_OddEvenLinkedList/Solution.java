package q328_OddEvenLinkedList;

/**
 * @author InterHorse
 * @date 2021-02-04 22:02:13
 * <p>
 * 328. 奇偶链表
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * <p>
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 1->3->5->2->4->NULL
 * 示例 2:
 * <p>
 * 输入: 2->1->3->5->6->4->7->NULL
 * 输出: 2->3->6->7->1->5->4->NULL
 * 说明:
 * <p>
 * 应当保持奇数节点和偶数节点的相对顺序。
 * 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
 * <p>
 * https://leetcode-cn.com/problems/odd-even-linked-list/
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode evenHead = head.next, p = head, q, oddLast = null;
        int count = 1;
        while (p != null) {
            q = p.next;
            p.next = p.next == null ? null : p.next.next;
            if (count++ % 2 == 1) {
                oddLast = p;
            }
            p = q;
        }
        oddLast.next = evenHead;
        return head;
    }
}
