package q22_GenerateParentheses;

import java.util.List;

/**
 * @author InterHorse
 * @date 2021-01-29 20:06:59
 */
public class Test {
    public static void main(String[] args) {
        print(new Solution().generateParenthesis(3));
    }

    private static void print(List<String> list) {
        System.out.print("[");
        boolean isFirst = true;
        for (String str : list) {
            if (!isFirst) {
                System.out.print(",");
            }
            System.out.print("\"");
            System.out.print(str);
            System.out.print("\"");
            isFirst = false;
        }
        System.out.print("]");
    }
}
