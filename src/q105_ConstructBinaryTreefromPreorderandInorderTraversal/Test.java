package q105_ConstructBinaryTreefromPreorderandInorderTraversal;


public class Test {
    public static void main(String[] args) {
        int[] preorder = new int[]{3, 1, 2, 4};
        int[] inorder = new int[]{1, 2, 3, 4};
        TreeNode treeNode = new Solution().buildTree(preorder, inorder);
        System.out.println();
    }
}
