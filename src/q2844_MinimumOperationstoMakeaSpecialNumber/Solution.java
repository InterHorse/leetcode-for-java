package q2844_MinimumOperationstoMakeaSpecialNumber;

/**
 * @author by yozee
 * @description
 * @date 2024/7/25
 */
public class Solution {
    public int minimumOperations(String num) {
        int lastZero = findLast(num, num.length() - 1, '0');
        // 零结尾
        int lastZero2 = findLast(num, num.length() - 1 - lastZero - 1, '0');
        int lastFive2 = findLast(num, num.length() - 1 - lastZero - 1, '5');
        int lastZeroRes;
        if (lastZero == num.length()) {
            lastZeroRes = num.length();
        } else if (lastZero2 < lastFive2) {
            lastZeroRes = lastZero + lastZero2;
        } else if (lastZero2 > lastFive2) {
            lastZeroRes = lastZero + lastFive2;
        } else {
            lastZeroRes = num.length() - 1;
        }

        int lastFiveRes;
        int lastFive = findLast(num, num.length() - 1, '5');
        // 五结尾
        int lastTwo2 = findLast(num, num.length() - 1 - lastFive - 1, '2');
        int lastSeven2 = findLast(num, num.length() - 1 - lastFive - 1, '7');
        if (lastFive == num.length()) {
            lastFiveRes = num.length();
        } else if (lastTwo2 < lastSeven2) {
            lastFiveRes = lastFive + lastTwo2;
        } else if (lastTwo2 > lastSeven2) {
            lastFiveRes = lastFive + lastSeven2;
        } else {
            lastFiveRes = num.length();
        }

        if (lastZeroRes < lastFiveRes) {
            return lastZeroRes;
        } else {
            return lastFiveRes;
        }
    }


    private int findLast(String num, int index, char c) {
        for (int i = index; i >= 0; i--) {
            if (num.charAt(i) == c) {
                return index - i;
            }
        }
        return num.length();
    }
}
