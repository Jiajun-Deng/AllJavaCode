/** 26. Remove Duplicates from Sorted Array
 * nums = [0,0,1,1,1,2,2,3,3,4]
 * After removing dups, nums = [0,1,2,3,4,2,2,3,3,4]
 * In-space algorthm, no extra space.
 * Time: O(n)
 * Spcae: O(1)
 * */
public class removeElement {
    public static int rmElement(int[] nums) {
        if (nums == null || nums.length == 0)  return 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[count] = nums[i];
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] a = new int[]{1,1,2,3,4,5,5,5};
        int len = removeDuplicates(a);
        for (int i = 0; i < len; i++){
            System.out.print(a[i]+" ");
        }
    }
}