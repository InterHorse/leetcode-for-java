package q56_MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author InterHorse
 * @date 2021-01-22 20:15:06
 * <p>
 * 56. 合并区间
 * 给出一个区间的集合，请合并所有重叠的区间。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2:
 * <p>
 * 输入: intervals = [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 * 注意：输入类型已于2019年4月15日更改。 请重置默认代码定义以获取新方法签名。
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * intervals[i][0] <= intervals[i][1]
 *
 * https://leetcode-cn.com/problems/merge-intervals/
 *
 * 思路：
 * 先按首位排序，然后合并数组。
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        List<int[]> resList = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (resList.isEmpty() || intervals[i][0] > resList.get(resList.size() - 1)[1]) {
                resList.add(new int[]{intervals[i][0], intervals[i][1]});
            } else {
                resList.get(resList.size() - 1)[1] = Math.max(resList.get(resList.size() - 1)[1], intervals[i][1]);
            }
        }
        return resList.toArray(new int[resList.size()][]);
    }
}
