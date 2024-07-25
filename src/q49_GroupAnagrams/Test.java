package q49_GroupAnagrams;

import java.util.List;

/**
 * @author by yozee
 * @description
 * @date 2024/7/25
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(test1());
        System.out.println(test2());
    }

    private static List<List<String>> test1() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        return new Solution().groupAnagrams(strs);
    }

    private static List<List<String>> test2() {
        String[] strs = {"a", "b", "c", "ab", "ba", "ab", "abc", "aabc", "baca"};
        return new Solution().groupAnagrams(strs);
    }
}
