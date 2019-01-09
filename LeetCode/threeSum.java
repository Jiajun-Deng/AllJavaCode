/**15. 3Sum
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * Example:
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 * */
import java.util.Array;
public class threeSum{
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<> ();
        List<Integer> list = new ArrayList<> ();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++){
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int low = i + 1, high = nums.length - 1;
            int sum = -nums[i];
            while (low < high){
                if (nums[low] + nums[high] == sum) {
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while(low < high && nums[low] == nums[low + 1]) low++;
                    while(low < high && nums[high] == nums[high - 1]) high--;
                }
                else if (nums[low] + nums[high] < sum) {low++;}
                else {high--;}
            }
        }
        return res;
    }
}