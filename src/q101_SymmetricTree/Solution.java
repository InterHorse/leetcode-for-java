package q101_SymmetricTree;

/**
 * @author InterHorse
 * @date 2021-01-17 15:08:57
 * <p>
 * 101. 对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 * <p>
 * <p>
 * <p>
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * <p>
 * <p>
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * <p>
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * <p>
 * https://leetcode-cn.com/problems/symmetric-tree/
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode lt, TreeNode rt) {
        if (lt == null && rt == null) {
            return true;
        }
        if (lt == null || rt == null) {
            return false;
        }
        if (lt.val != rt.val) {
            return false;
        }
        return isSymmetric(lt.left, rt.right) && isSymmetric(lt.right, rt.left);
    }
}
