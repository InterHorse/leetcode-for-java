package q7_ReverseInteger;

/**
 * Created by IDEA
 *
 * @author Ma Yuzhe
 * @date 2018/7/13
 * @time 16:18
 * <p>
 * 反转整数
 * <p>
 * RunTime:29ms
 */
public class Solution {
    public int reverse(int x) {
        long result = 0;
        int tmp = Math.abs(x);
        while (tmp > 0) {
            result *= 10;
            result += tmp % 10;
            if (result > Integer.MAX_VALUE) {
                return 0;
            }
            tmp /= 10;
        }
        return (int) (x >= 0 ? result : -result);
    }
}
