package q22_GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * @author InterHorse
 * @date 2021-01-29 19:58:23
 *
 * 22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 *
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 *
 * 输入：n = 1
 * 输出：["()"]
 *
 *
 * 提示：
 *
 * 1 <= n <= 8
 *
 * https://leetcode-cn.com/problems/generate-parentheses/
 *
 * 思路：DFS 搜索
 */
public class Solution {
    private final List<String> resList = new ArrayList<>(16);
    public List<String> generateParenthesis(int n) {
        createList(n, n, "");
        return this.resList;
    }

    private void createList(int left, int right, String fatherStr) {
        if (left == 0 && right == 0) {
            resList.add(fatherStr);
            return;
        }
        if (left > right) {
            return;
        }
        if (left > 0) {
            createList(left - 1, right, fatherStr + "(");
        }

        if (right > 0) {
            createList(left, right - 1, fatherStr + ")");
        }
    }
}
