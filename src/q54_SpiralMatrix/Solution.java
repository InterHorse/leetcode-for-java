package q54_SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @author InterHorse
 * @date 2021-02-04 19:27:31
 * <p>
 * 54. 螺旋矩阵
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * 示例 2：
 * <p>
 * <p>
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 * <p>
 * <p>
 * 提示：
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 10
 * -100 <= matrix[i][j] <= 100
 * <p>
 * https://leetcode-cn.com/problems/spiral-matrix/
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resList = new ArrayList<>(16);
        if (matrix.length == 0 || matrix[0].length == 0) {
            return resList;
        }
        int directionCounter = 0;
        boolean isNext = true;
        int row = 0, col = 0;
        while (isNext) {
            int nextRow, nextCol;
            resList.add(matrix[row][col]);
            matrix[row][col] = 1000;
            int direction = directionCounter % 4;
            if (direction == 0) {
                nextRow = row;
                nextCol = col + 1;
            } else if (direction == 1) {
                nextRow = row + 1;
                nextCol = col;
            } else if (direction == 2) {
                nextRow = row;
                nextCol = col - 1;
            } else {
                nextRow = row - 1;
                nextCol = col;
            }
            if (nextRow < 0 || nextCol < 0 || nextRow == matrix.length || nextCol == matrix[0].length || matrix[nextRow][nextCol] == 1000) {
                direction = ++directionCounter % 4;
                if (direction == 0) {
                    nextRow = row;
                    nextCol = col + 1;
                } else if (direction == 1) {
                    nextRow = row + 1;
                    nextCol = col;
                } else if (direction == 2) {
                    nextRow = row;
                    nextCol = col - 1;
                } else {
                    nextRow = row - 1;
                    nextCol = col;
                }
                if (nextRow < 0 || nextCol < 0 || nextRow == matrix.length || nextCol == matrix[0].length || matrix[nextRow][nextCol] == 1000) {
                    isNext = false;
                }
            }
            row = nextRow;
            col = nextCol;
        }
        return resList;
    }
}
