package q98_ValidateBinarySearchTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author InterHorse
 * @date 2021-01-16 18:40:34
 */
public class Solution {
    private boolean isAValidBST = true;
    private List<Integer> resList;

    public boolean isValidBST(TreeNode root) {
        resList = new ArrayList<>(16);
        scanInorderTraversal(root);
        return isAValidBST;
    }

    private void scanInorderTraversal(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        scanInorderTraversal(treeNode.left);
        if (resList.size() > 0 && treeNode.val <= resList.get(resList.size() - 1)) {
            isAValidBST = false;
        }
        resList.add(treeNode.val);
        scanInorderTraversal(treeNode.right);
    }
}

/*
思路：
中序遍历为严格单调递增。
 */


