package q105_ConstructBinaryTreefromPreorderandInorderTraversal;

/**
 * @author InterHorse
 * @date 2021-01-20 17:46:27
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
