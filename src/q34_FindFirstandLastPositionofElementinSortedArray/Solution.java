package q34_FindFirstandLastPositionofElementinSortedArray;

/**
 * @author InterHorse
 * @date 2021-02-03 18:57:52
 *
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 进阶：
 *
 * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
 *
 *
 * 示例 1：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * 示例 2：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * 示例 3：
 *
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 *
 *
 * 提示：
 *
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums 是一个非递减数组
 * -109 <= target <= 109
 *
 * https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 *
 * 思路：递归二分法。一次找左边界，一次找有边界。注意边界判定条件。
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        return new int[]{binarySearchLeft(nums, target, 0, nums.length - 1), binarySearchRight(nums, target, 0, nums.length - 1)};
    }

    private int binarySearchLeft(int[] nums, int target, int lt, int rt) {
        if (lt == rt) {
            if (nums[lt] == target) {
                return lt;
            } else {
                return -1;
            }
        }
        int idx = (lt + rt) / 2;
        if (nums[idx] >= target) {
            idx = binarySearchLeft(nums, target, lt, idx);
        } else {
            idx = binarySearchLeft(nums, target, idx + 1, rt);
        }
        return idx;
    }

    private int binarySearchRight(int[] nums, int target, int lt, int rt) {
        if (lt == rt) {
            if (nums[rt] == target) {
                return rt;
            } else {
                return -1;
            }
        }
        int idx = (lt + rt) / 2 + 1;
        if (nums[idx] <= target) {
            idx = binarySearchRight(nums, target, idx, rt);
        } else {
            idx = binarySearchRight(nums, target, lt, idx - 1);
        }
        return idx;
    }
}
