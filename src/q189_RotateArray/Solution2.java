package q189_RotateArray;

/**
 * Created by IDEA
 *
 * @author Ma Yuzhe
 * @date 2018/6/14
 * @time 12:55
 * <p>
 * Runtime: 1ms
 * <p>
 * <p>
 * EN:
 * Rotate an array of n elements to the right by k steps.
 * <p>
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * <p>
 * Note:
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * <p>
 * [show hint]
 * <p>
 * Hint:
 * Could you do it in-place with O(1) extra space?
 * <p>
 * Related problem: Reverse Words in a String II
 * <p>
 * Credits:
 * Special thanks to @Freezen for adding this problem and creating all test cases.
 * <p>
 * 中文：旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 * <p>
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 说明:
 * <p>
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的原地算法。
 */
public class Solution2 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 0) {
            return;
        }
        int arrLength = nums.length;
        int mvSteps = k % arrLength;
        if (mvSteps == 0) {
            return;
        }

        // 对调数组
        swapArray(nums, 0, arrLength - 1);
        // 以步数为分界，对调前一半数组
        swapArray(nums, 0, mvSteps - 1);
        // 以步数为分界，对调后一半数组
        swapArray(nums, mvSteps, arrLength - 1);

    }

    /**
     * 对调数组
     *
     * @param nums
     * @param x
     * @param y
     */
    private void swapArray(int[] nums, int x, int y) {
        while (x < y) {
            swap(nums, x, y);
            x++;
            y--;
        }
    }

    /**
     * 元素对调
     *
     * @param nums
     * @param x
     * @param y
     */
    private void swap(int[] nums, int x, int y) {
        if (x != y) {
            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;
        }
    }
}
