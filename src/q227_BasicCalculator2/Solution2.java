package q227_BasicCalculator2;

/**
 * @author Yuzhe Ma
 * @date 2019-03-17
 */
public class Solution2 {
    public int calculate(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        int res = 0;
        int curRes = 0;
        char sign = '+';
        int len = s.length();
        int num = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(c == ' ' && i != len - 1){
                continue;
            }
            if(c >= '0' && c <= '9'){
                num = num*10+c-'0';
            }
            if(c == '+' || c == '-' || c== '*' || c == '/' || i == len-1){
                switch(sign){
                    case '+':curRes+=num;break;
                    case '-':curRes-=num;break;
                    case '*':curRes*=num;break;
                    case '/':curRes/=num;break;
                }
                if(c == '+' || c == '-' || i == len-1){
                    res += curRes;
                    curRes = 0;
                }
                sign = c;
                num = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String str = "1 + 2 * 3 / 2 - 7 + 8";
        System.out.println(solution.calculate(str));
    }
}
