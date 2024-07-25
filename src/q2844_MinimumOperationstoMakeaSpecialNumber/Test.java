package q2844_MinimumOperationstoMakeaSpecialNumber;

/**
 * @author by yozee
 * @description
 * @date 2024/7/25
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(test1());
        System.out.println(test2());
        System.out.println(test3());
        System.out.println(test4());
    }

    private static int test1() {
        return new Solution().minimumOperations("2245047");
    }

    private static int test2() {
        return new Solution().minimumOperations("2908305");
    }

    private static int test3() {
        return new Solution().minimumOperations("10");
    }

    private static int test4() {
        return new Solution().minimumOperations("11");
    }
}
