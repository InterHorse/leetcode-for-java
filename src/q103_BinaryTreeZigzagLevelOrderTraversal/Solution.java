package q103_BinaryTreeZigzagLevelOrderTraversal;

import java.util.*;

/**
 * @author InterHorse
 * @date 2021-01-17 15:25:45
 * <p>
 * 103. 二叉树的锯齿形层序遍历
 * 给定一个二叉树，返回其节点值的锯齿形层序遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 * <p>
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回锯齿形层序遍历如下：
 * <p>
 * [
 * [3],
 * [20,9],
 * [15,7]
 * ]
 * <p>
 * https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>(16);
        Queue<TreeNode> queueList = new LinkedList<>();
        if (root != null) {
            queueList.offer(root);
        }
        int depth = 0;
        while (queueList.size() != 0) {
            List<Integer> sonList = new LinkedList<>();
            int queueSize = queueList.size();
            for (int i = 0; i < queueSize; i++) {
                TreeNode treeNode = queueList.poll();
                if (treeNode.left != null) {
                    queueList.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queueList.offer(treeNode.right);
                }
                if (depth % 2 == 0) {
                    sonList.add(treeNode.val);
                } else {
                    sonList.add(0, treeNode.val);
                }
            }
            depth++;
            resList.add(sonList);
        }
        return resList;
    }
}