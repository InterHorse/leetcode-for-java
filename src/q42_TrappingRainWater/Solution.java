package q42_TrappingRainWater;

import java.util.Stack;

/**
 * @author Yuzhe Ma
 * @date 2019-03-17
 * <p>
 * https://leetcode-cn.com/problems/trapping-rain-water/
 */
public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int sumArea = 0;
        Stack<Integer> stack = new Stack<>();
        for (int right = 0; right < height.length; right++) {
            while (!stack.isEmpty() && height[stack.peek()] < height[right]) {
                if (stack.size() >= 2) {
                    int j = stack.pop();
                    int left = stack.peek();
                    int curArea = (Math.min(height[right], height[left]) - height[j]) * (right - left - 1);
                    sumArea += curArea;
                } else {
                    stack.pop();
                }
            }
            stack.push(right);
        }
        return sumArea;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        Solution solution = new Solution();
        System.out.println(solution.trap(arr));
    }
}
