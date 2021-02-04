package q41_FirstMissingPositive;

/**
 * @author Yuzhe Ma
 * @date 2021-02-04 21:05:10
 *
 * 41. 缺失的第一个正数
 * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 *
 * 进阶：你可以实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案吗？
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,0]
 * 输出：3
 * 示例 2：
 *
 * 输入：nums = [3,4,-1,1]
 * 输出：2
 * 示例 3：
 *
 * 输入：nums = [7,8,9,11,12]
 * 输出：1
 *
 *
 * 提示：
 *
 * 0 <= nums.length <= 300
 * -231 <= nums[i] <= 231 - 1
 *
 * https://leetcode-cn.com/problems/first-missing-positive/
 */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        // 第一次遍历，把大于 0 的数置换到数组中对应位置 [1, 2, 3, 4, ...]
        int num = 1;
        for (int i = 0; i < nums.length; i++) {
            // 置换到直到不需要置换了为止
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                int tmp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[tmp - 1] = tmp;
            }
        }
        // 第二次遍历，找第一个对不上的数即为要找的最小正整数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i + 1) num++;
            else break;
        }
        return num;
    }
}
