package q105_ConstructBinaryTreefromPreorderandInorderTraversal;

/**
 * @author InterHorse
 * @date 2021-01-20 17:44:13
 *
 * 从前序与中序遍历序列构造二叉树
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 *
 * 注意:
 * 你可以假设树中没有重复的元素。
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        return createBinaryTree(preorder, 0, inorder, 0, inorder.length - 1);
    }

    private TreeNode createBinaryTree(int[] preorder, int preIdx, int[] inorder, int inIdxL, int inIdxR) {
        TreeNode tn = new TreeNode(preorder[preIdx]);
        int inIdx = inIdxL;
        while (inorder[inIdx] != preorder[preIdx]) {
            inIdx++;
        }
        if (inIdx - inIdxL > 0) {
            tn.left = createBinaryTree(preorder, preIdx + 1, inorder, inIdxL, inIdx - 1);
        }
        if (inIdxR - inIdx > 0) {
            tn.right = createBinaryTree(preorder, preIdx + inIdx - inIdxL + 1, inorder, inIdx + 1, inIdxR);
        }
        return tn;
    }
}
