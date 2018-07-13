package q48_RotateImage;

/**
 * Created by IDEA
 *
 * @author Ma Yuzhe
 * @date 2018/7/13
 * @time 15:23
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = new int[][]{
                {1,2,3,10},
                {4,5,6,20},
                {7,8,9,30},
                {40,50,60,70},
        };
        solution.rotate(matrix);
        print(matrix);

    }

    private static void print(int[][] matrix){
        int n = matrix[0].length;
        for(int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
