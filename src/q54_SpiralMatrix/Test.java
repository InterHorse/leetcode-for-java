package q54_SpiralMatrix;

import java.util.List;

/**
 * @author InterHorse
 * @date 2021-02-04 19:50:55
 */
public class Test {
    public static void main(String[] args) {
//        print(new Solution().spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
//        print(new Solution().spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        print(new Solution().spiralOrder(new int[][]{}));
    }

    private static void print(List<Integer> list) {
        for (Integer num : list) {
            System.out.print(num + ", ");
        }
    }
}
