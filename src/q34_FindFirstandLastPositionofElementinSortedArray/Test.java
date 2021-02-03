package q34_FindFirstandLastPositionofElementinSortedArray;

/**
 * @author InterHorse
 * @date 2021-02-03 19:25:11
 */
public class Test {
    public static void main(String[] args) {
//        int[] res = new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
//        int[] res = new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 10);
//        int[] res = new Solution().searchRange(new int[]{1}, 1);
        int[] res = new Solution2().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 4);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}
