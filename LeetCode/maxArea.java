/**11. Container With Most Water
 * Given n non-negative integers a1, a2, ..., an ,
 * where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container,
 * such that the container contains the most water.
 * time: O(n), Space: O(1)
 * */
public class maxArea{
    public static int maxArea(int[] height) {
        int res = 0;
        int l = 0, r = height.length - 1;
        while(l < r){
            res = Math.max(res, Math.min(height[l], height[r])*(r - l));
            if (height[l] < height[r]) l++;
            else r--;
        }
        return res;
    }

}