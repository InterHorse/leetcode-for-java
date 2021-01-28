package q78_Subsets;

import java.util.List;

/**
 * @author InterHorse
 * @date 2021-01-28 21:24:51
 */
public class Test {
    public static void main(String[] args) {
        List<List<Integer>> list = new Solotion().subsets(new int[]{1,2});
        print(list);
    }

    private static void print(List<List<Integer>> list) {
        System.out.print("[");
        int idx1 = 0;
        for (List<Integer> sl : list) {
            if (idx1++ != 0) {
                System.out.print(",");
            }
            System.out.print("[");
            int idx2 = 0;
            for (Integer num : sl) {
                if (idx2++ != 0) {
                    System.out.print(",");
                }
                System.out.print(num);
            }
            System.out.print("]");

        }
        System.out.print("]");
    }
}
