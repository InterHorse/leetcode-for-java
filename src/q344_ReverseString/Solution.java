package q344_ReverseString;

/**
 * Created by IDEA
 *
 * @author Ma Yuzhe
 * @date 2018/7/13
 * @time 16:02
 * <p>
 * RunTime:3ms
 * <p>
 * EN:
 * Write a function that takes a string as input and returns the string reversed.
 * <p>
 * Example:
 * Given s = "hello", return "olleh".
 * <p>
 * 中文：反转字符串
 * 请编写一个函数，其功能是将输入的字符串反转过来。
 * <p>
 * 示例：
 * <p>
 * 输入：s = "hello"
 * 返回："olleh"
 */
public class Solution {
    public String reverseString(String s) {
        if (s == null || s.equals("")) {
            return s;
        }
        char[] charArr = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++) {
            char tmp = charArr[i];
            charArr[i] = charArr[s.length() - 1 - i];
            charArr[s.length() - 1 - i] = tmp;
        }
        return new String(charArr);
    }
}
