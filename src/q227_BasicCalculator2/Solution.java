package q227_BasicCalculator2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Yuzhe Ma
 * @date 2019-03-17
 * <p>
 * Implement a basic calculator to evaluate a simple expression string.
 * <p>
 * The expression string contains only non-negative integers, +, -, *, / operators and empty spaces . The integer division should truncate toward zero.
 * <p>
 * Example 1:
 * <p>
 * Input: "3+2*2"
 * Output: 7
 * Example 2:
 * <p>
 * Input: " 3/2 "
 * Output: 1
 * Example 3:
 * <p>
 * Input: " 3+5 / 2 "
 * Output: 5
 * Note:
 * <p>
 * You may assume that the given expression is always valid.
 * Do not use the eval built-in library function.
 * <p>
 * 实现一个基本的计算器来计算一个简单的字符串表达式的值。
 * <p>
 * 字符串表达式仅包含非负整数，+， - ，*，/ 四种运算符和空格  。 整数除法仅保留整数部分。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "3+2*2"
 * 输出: 7
 * 示例 2:
 * <p>
 * 输入: " 3/2 "
 * 输出: 1
 * 示例 3:
 * <p>
 * 输入: " 3+5 / 2 "
 * 输出: 5
 * 说明：
 * <p>
 * 你可以假设所给定的表达式都是有效的。
 * 请不要使用内置的库函数 eval。
 */
public class Solution {
    public Solution() {
        operatorsLevel.put("+", 1);
        operatorsLevel.put("-", 1);
        operatorsLevel.put("*", 2);
        operatorsLevel.put("/", 2);
    }

    private Map<String, Integer> operatorsLevel = new HashMap<>(4);

    public int calculate(String s) {
        s = s.replaceAll(" ", "");
        String[] arr = s.split("");
        Stack<Integer> numStack = new Stack<>();
        Stack<String> operatorStack = new Stack<>();
        String tmp = "";
        for (String str : arr) {
            if (Character.isDigit(str.toCharArray()[0])) {
                tmp += str;
            } else {
                numStack.push(Integer.parseInt(tmp));
                tmp = "";

                if (operatorStack.isEmpty() || operatorsLevel.get(operatorStack.peek()) < operatorsLevel.get(str)) {
                    operatorStack.push(str);
                } else {
                    while (!operatorStack.isEmpty() && operatorsLevel.get(operatorStack.peek()) >= operatorsLevel.get(str)) {
                        int num2 = numStack.pop();
                        int num1 = numStack.pop();
                        numStack.push(cal(num1, num2, operatorStack.pop()));
                    }
                    operatorStack.push(str);
                }
            }
        }
        if (!tmp.equals("")) {
            numStack.push(Integer.parseInt(tmp));
        }
        while (!operatorStack.isEmpty()) {
            int num2 = numStack.pop();
            int num1 = numStack.pop();
            numStack.push(cal(num1, num2, operatorStack.pop()));
        }
        return numStack.pop();
    }

    private int cal(int num1, int num2, String o) {
        switch (o) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "1 + 2 + 3";
        System.out.println(solution.calculate(str));
    }
}
