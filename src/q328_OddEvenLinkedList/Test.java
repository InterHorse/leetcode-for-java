package q328_OddEvenLinkedList;

/**
 * @author InterHorse
 * @date 2021-01-17 15:25:45
 */
public class Test {
    public static void main(String[] args) {
        print(new Solution().oddEvenList(createList(new int[]{1, 2, 3, 4, 5})));
        print(new Solution().oddEvenList(createList(new int[]{1, 2, 3, 4})));
        print(new Solution().oddEvenList(createList(new int[]{})));
    }

    private static ListNode createList(int[] nums) {
        ListNode listNode = null, p = null;
        for (Integer num : nums) {
            if (listNode == null) {
                listNode = new ListNode(num, null);
                p = listNode;
            } else {
                p.next = new ListNode(num, null);
                p = p.next;
            }
        }
        return listNode;
    }

    private static void print(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " -> ");
            listNode = listNode.next;
        }
        System.out.print("Null");
        System.out.println();
    }
}
