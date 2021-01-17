package q102_BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author InterHorse
 * @date 2021-01-17 14:41:07
 *
 * 二叉树的层序遍历
 *
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 *
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层序遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 思路：
 * 先序遍历，用深度标记 list 索引。
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>(16);
        scanTree(resList, root, 0);
        return resList;
    }

    private void scanTree(List<List<Integer>> list, TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        if (list.size() < depth + 1) {
            List<Integer> sonList = new ArrayList<>(16);
            sonList.add(node.val);
            list.add(sonList);
        } else {
            list.get(depth).add(node.val);
        }
        scanTree(list, node.left, depth + 1);
        scanTree(list, node.right, depth + 1);
    }
}
