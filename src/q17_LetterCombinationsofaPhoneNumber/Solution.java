package q17_LetterCombinationsofaPhoneNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * @author InterHorse
 * @date 2021-02-02 19:17:55
 * <p>
 * 17. 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * <p>
 * 示例 1：
 * <p>
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 示例 2：
 * <p>
 * 输入：digits = ""
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= digits.length <= 4
 * digits[i] 是范围 ['2', '9'] 的一个数字。
 * <p>
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 */
public class Solution {
    private static final String[] keyboard = new String[]{"!@#", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private List<String> resList;
    private String digits;

    public List<String> letterCombinations(String digits) {
        this.digits = digits;
        this.resList = new ArrayList<>(16);
        createString("", 0);
        return this.resList;
    }

    private void createString(String str, int index) {
        if (index < digits.length() - 1) {
            for (int i = 0; i < keyboard[Integer.parseInt(String.valueOf(digits.charAt(index))) - 1].length(); i++) {
                createString(str + keyboard[Integer.parseInt(String.valueOf(digits.charAt(index))) - 1].charAt(i), index + 1);
            }
        }
        if (index == digits.length() - 1) {
            for (int i = 0; i < keyboard[Integer.parseInt(String.valueOf(digits.charAt(index))) - 1].length(); i++) {
                resList.add(str + keyboard[Integer.parseInt(String.valueOf(digits.charAt(index))) - 1].charAt(i));
            }
        }
    }
}
