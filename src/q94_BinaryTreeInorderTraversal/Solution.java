package q94_BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author InterHorse
 * @date 2021-01-16 18:29:28
 * <p>
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 * <p>
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
public class Solution {
    private List<Integer> resList;

    public List<Integer> inorderTraversal(TreeNode root) {
        resList = new ArrayList<>(16);
        scanInorderTraversal(root);
        return resList;
    }

    private void scanInorderTraversal(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        scanInorderTraversal(treeNode.left);
        resList.add(treeNode.val);
        scanInorderTraversal(treeNode.right);
    }
}
