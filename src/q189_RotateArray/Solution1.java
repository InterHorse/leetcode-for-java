package q189_RotateArray;

/**
 * Created with IDEA
 * Author: Ma Yuzhe
 * Date: 2018/6/14
 * Time: 12:44
 * <p>
 * Runtime: 136ms
 * <p>
 * <p>
 * 思路：这个方法不是最优的。这是一开始想到的，就是挪几步就循环挪一步几次，效率为O(N²)
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
 * <p>
 */
public class Solution1 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 0) {
            return;
        }
        int arrLength = nums.length;
        int mvSteps = k % arrLength;
        if (mvSteps == 0) {
            return;
        }
        for (int i = 0; i < mvSteps; i++) {
            mv1Step(nums);
        }
    }

    /**
     * 向右挪一步
     *
     * @param nums
     */
    private void mv1Step(int[] nums) {
        int temp = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }
}
