package q11_ContainerWithMostWater;

/**
 * @author InterHorse
 * @date 2021-01-27 19:41:09
 * <p>
 * 11. 盛最多水的容器
 * <p>
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点(i,ai) 。在坐标内画 n 条垂直线，垂直线 i的两个端点分别为(i,ai) 和 (i, 0) 。找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int maxArea(int[] height) {
        int li = 0, ri = height.length - 1, maxWater = 0;
        while (li != ri) {
            maxWater = Math.max(maxWater, (ri - li) * Math.min(height[li], height[ri]));
            if (height[li] < height[ri]) li++;
            else ri--;
        }
        return maxWater;
    }
}
