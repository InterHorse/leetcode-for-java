package q350_IntersectionofTwoArrays2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IDEA
 *
 * @author Ma Yuzhe
 * @date 2018/6/14
 * @time 13:10
 * <p>
 * Runtime: 5ms
 * <p>
 * 思路：先排序，再用两个“指针”进行遍历比对。
 * <p>
 * <p>
 * EN:
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * <p>
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 * <p>
 * 中文：两个数组的交集 II
 * 给定两个数组，写一个方法来计算它们的交集。
 * <p>
 * 例如:
 * 给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
 * <p>
 * 注意：
 * <p>
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 跟进:
 * <p>
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果nums2的元素存储在磁盘上，内存是有限的，你不能一次加载所有的元素到内存中，你该怎么办？
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>(16);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] num3 = new int[list.size()];
        for (int k = 0; k < num3.length; k++) {
            num3[k] = list.get(k);
        }

        return num3;
    }
}
