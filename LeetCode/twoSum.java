/** L1 Two sum
 * Return the indices for the two values whose sum equals to target.
 *
 * Solution:
 *
 * Time complexity: O(n)
 * SC: O(n)
 *
 * About HashMap:
 * 1. Store key and value correspondingly. put(key,value);
 * 2. Check contains a key or not, then get the value of the key.  containsKey(); get();
 * 3. Two pass Hash Table, no duplicate keys.
 * 4. Need to import HashMap class.
 * */
import java.util.HashMap;/**Import the HashMap class*/

public class twoSum{
    public static int[] twoSum(int[] nums, int target){

        HashMap<Integer, Integer> map = new HashMap<>();

        if (nums == null || nums.length < 2)
            return new int[]{-1, -1}; /** invalid input array*/

        int[] ret = new int[]{-1, -1};

            for (int i = 0; i < nums.length; i++){
                if (map.containsKey(target - nums[i]))
                {
                    ret[0] = map.get(target - nums[i]);
                    ret[1] = i;
                    break;
                }
                map.put(nums[i], i);
            }

            return ret;
    }

    public static void main(String[] args){
        int[] nums = {2, 2, 11, 15};
        int target = 4;
        int[] ret = twoSum(nums, target);
        for (int i = 0; i < ret.length; i++)
        {
            System.out.print(ret[i]+" ");
        }
    }
}