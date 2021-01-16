package q3_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

/**
 * @author InterHorse
 * @date 2021-01-16 13:30:26
 * <p>
 * 给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
 * <p>
 *
 * <p>
 * 示例1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> cSet = new HashSet<>(26);
        int maxLength = 0;
        int currentLength = 0;
        int lIndex;
        int rIndex = 0;
        for (lIndex = 0; lIndex < s.length(); lIndex++) {
            while (rIndex < s.length() && !cSet.contains(s.charAt(rIndex))) {
                cSet.add(s.charAt(rIndex));
                rIndex++;
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            }
            if (rIndex >= s.length()) {
                break;
            }
            cSet.remove(s.charAt(lIndex));
            currentLength--;
        }
        return maxLength;
    }
}
