package q5_LongestPalindromicSubstring;

/**
 * @author InterHorse
 * @date 2021-01-16 17:19:03
 * <p>
 * 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 * <p>
 * 输入：s = "cbbd"
 * 输出："bb"
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母（大写和/或小写）组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        boolean[][] table = new boolean[length][length];
        int l = 0, r = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (s.charAt(j) == s.charAt(j + i)) {
                    if (i > 1) {
                        if (table[j + 1][j + i - 1]) {
                            table[j][j + i] = true;
                        } else {
                            table[j][j + i] = false;
                        }
                    } else {
                        table[j][j + i] = true;
                    }
                } else {
                    table[j][j + i] = false;
                }
            }
        }
        boolean isBreak = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i + 1; j++) {
                if (table[j][s.length() - 1 - i + j]) {
                    l = j;
                    r = s.length() - 1 - i + j;
                    isBreak = true;
                    break;
                }
            }
            if (isBreak) {
                break;
            }
        }
        return s.substring(l, r + 1);
    }
}

/*
思路，动态规划。
待优化点：
1. 二维数组可以变为一维，因为只用上到右上三角区，可以压缩节省空间。
2. 找最右上角的 true，可以边判定边存最右上的 true。即，后面的 for 循环可以省略。
 */
