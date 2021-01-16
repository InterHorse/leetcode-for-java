package q4_MedianofTwoSortedArrays;

/**
 * @author InterHorse
 * @date 2021-01-16 16:31:12
 * <p>
 * 给定两个大小为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的中位数。
 * <p>
 * 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 计算总长度
        int totalLength = nums1.length + nums2.length;
        // 只需要一半 + 1 个空间就可以用于计算中位数
        int[] nums3 = new int[totalLength / 2 + 1];
        int index1 = 0, index2 = 0, p = 0;
        double median;
        while (p < nums3.length) {
            if (index1 < nums1.length && index2 < nums2.length) {
                if (nums1[index1] < nums2[index2]) {
                    nums3[p++] = nums1[index1++];
                } else {
                    nums3[p++] = nums2[index2++];
                }
            } else if (index1 >= nums1.length) {
                nums3[p++] = nums2[index2++];
            } else {
                nums3[p++] = nums1[index1++];
            }
        }
        // 如果总长度是偶数，则计算后两位的平均数。如果是单数，则取最后一位即可。
        if (totalLength % 2 == 0) {
            median = ((double) nums3[nums3.length - 1] + (double) nums3[nums3.length - 2]) / 2;
        } else {
            median = nums3[nums3.length - 1];
        }
        return median;
    }
}
