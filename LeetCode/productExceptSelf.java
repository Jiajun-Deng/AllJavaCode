/**238. Product of Array Except Self
 * Given an array nums of n integers where n > 1,  return an array output
 * such that output[i] is equal to the product of all the elements of nums except nums[i].
 * Example:
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 * Time: O(n), Space: O(n)
 * */

public class productExceptSelf{
    public static int[] productExceptSelf(int[] nums){
        if (nums == null || nums.length == 0) return nums;
        int[] res = new int[nums.length];
        res[0] = 1;
        int right = 1;
        for (int i = 1; i < nums.length; i++){
            res[i] = res[i-1] * nums[i-1];
        }
        for (int i = nums.length - 1; i >= 0; i--){
            res[i] = res[i] * right;
            right = right * nums[i];
        }
        return res;
    }
}