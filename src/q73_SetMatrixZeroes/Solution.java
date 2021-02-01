package q73_SetMatrixZeroes;

import java.util.Arrays;

/**
 * @author InterHorse
 * @date 2021-02-01 19:45:11
 *
 * 73. 矩阵置零
 * 给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *   [1,1,1],
 *   [1,0,1],
 *   [1,1,1]
 * ]
 * 输出:
 * [
 *   [1,0,1],
 *   [0,0,0],
 *   [1,0,1]
 * ]
 * 示例 2:
 *
 * 输入:
 * [
 *   [0,1,2,0],
 *   [3,4,5,2],
 *   [1,3,1,5]
 * ]
 * 输出:
 * [
 *   [0,0,0,0],
 *   [0,4,5,0],
 *   [0,3,1,0]
 * ]
 * 进阶:
 *
 * 一个直接的解决方案是使用  O(mn) 的额外空间，但这并不是一个好的解决方案。
 * 一个简单的改进方案是使用 O(m + n) 的额外空间，但这仍然不是最好的解决方案。
 * 你能想出一个常数空间的解决方案吗？
 *
 * https://leetcode-cn.com/problems/set-matrix-zeroes/
 *
 * 思路：
 * 从[1][1]开始遍历，遇到0，则将首行首列置为 0.最后根据首行首列是否为 0 刷新表格
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        // 先看首行首列存不存在 0，如果存在则修改 flag
        boolean isFirstRowZero = false, isFirstColZero = false;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                isFirstRowZero = true;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                isFirstColZero = true;
            }
        }
        // 置首位为 0
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        // 从第二行首位开始
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        // 从第二列首位开始
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        // 如果首行存在 0， 则第一行最后置为 0
        if (isFirstRowZero) {
            Arrays.fill(matrix[0], 0);
        }
        // 如果首列存在 0， 则第一列最后置为 0
        if (isFirstColZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
