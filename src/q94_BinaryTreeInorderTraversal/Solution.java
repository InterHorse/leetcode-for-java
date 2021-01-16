package q94_BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author InterHorse
 * @date 2021-01-16 18:29:28
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
