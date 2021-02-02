package q17_LetterCombinationsofaPhoneNumber;

import java.util.List;

/**
 * @author InterHorse
 * @date 2021-02-02 19:36:42
 */
public class Test {
    public static void main(String[] args) {
        print(new Solution().letterCombinations("6735"));
    }

    private static void print(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
