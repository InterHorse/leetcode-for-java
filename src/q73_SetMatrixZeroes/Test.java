package q73_SetMatrixZeroes;

/**
 * @author InterHorse
 * @date 2021-02-01 19:54:37
 */
public class Test {
    public static void main(String[] args) {
//        int[][] matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
//        int[][] matrix = new int[][]{{0, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] matrix = new int[][]{{0, 1, 1}, {0, 1, 1}, {1, 1, 1}, {1, 1, 1}};
//        int[][] matrix = new int[][]{{0, 1, 1}, {1, 1, 1}, {1, 1, 1}};
//        int[][] matrix = new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        System.out.println("Old Matrix:");
        print(matrix);
        new Solution().setZeroes(matrix);
        System.out.println("New Matrix:");
        print(matrix);
    }

    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
