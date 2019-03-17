package q20_ValidParentheses;

import java.util.*;

/**
 * @author Yuzhe Ma
 * @date 2019-03-17
 * <p>
 * https://leetcode-cn.com/problems/valid-parentheses/
 * <p>
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * <p>
 * Input: "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: "(]"
 * Output: false
 * Example 4:
 * <p>
 * Input: "([)]"
 * Output: false
 * Example 5:
 * <p>
 * Input: "{[]}"
 * Output: true
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 */
public class Solution {
    public Solution(){
        prefixParenthesis.put("{", "}");
        prefixParenthesis.put("(", ")");
        prefixParenthesis.put("[", "]");
    }

    private Map<String, String> prefixParenthesis = new HashMap<>(3);

    public boolean isValid(String s) {
        if (s.equals("")) {
            return true;
        }
        Stack<String> stack = new Stack<>();
        String[] arr = s.split("");
        for (String str : arr) {
            if (prefixParenthesis.containsKey(str)) {
                stack.push(str);
            } else {
                if (stack.isEmpty() || !prefixParenthesis.get(stack.peek()).equals(str)){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
