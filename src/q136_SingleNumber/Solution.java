package q136_SingleNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IDEA
 *
 * @author Ma Yuzhe
 * @date 2018/6/14
 * @time 13:01
 * <p>
 * Runtime: 20ms
 * <p>
 * 思路：用hash做匹配（这里用的HashMap,用HashSet也可以）
 * <p>
 * EN:
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * <p>
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Example 1:
 * <p>
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 * <p>
 * Input: [4,1,2,1,2]
 * Output: 4
 * <p>
 * 中文：只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.remove(nums[i]);
            }
        }
        int num = 0;
        for (Integer key : map.keySet()) {
            num = key;
        }
        return num;
    }
}
