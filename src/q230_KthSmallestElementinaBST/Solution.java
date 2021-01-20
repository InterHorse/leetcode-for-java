package q230_KthSmallestElementinaBST;

/**
 * @author InterHorse
 * @date 2021-01-20 22:40:29
 *
 * 230. 二叉搜索树中第K小的元素
 * 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
 *
 * 说明：
 * 你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。
 *
 * 示例 1:
 *
 * 输入: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * 输出: 1
 * 示例 2:
 *
 * 输入: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * 输出: 3
 *
 * https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
 *
 * 思路：
 * 中序遍历，遍历到第 k 个截止。
 */
class Solution {
    private int index = 0;
    private int theK;
    private int num;
    public int kthSmallest(TreeNode root, int k) {
        this.theK = k;
        scanTree(root);
        return num;
    }

    private void scanTree(TreeNode treeNode) {
        if (theK == index || treeNode == null) {
            return;
        }
        scanTree(treeNode.left);
        index++;
        if (theK == index) {
            num = treeNode.val;
            return;
        }
        scanTree(treeNode.right);
    }
}