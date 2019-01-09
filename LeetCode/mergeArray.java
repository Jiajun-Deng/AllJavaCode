/**88. Merge two sorted arrays.
 * 1.Compare the last item in two arrays.
 * 2.Put the larger one at the end of nums1. Move the index backward.
 * 3.When to decreament each index.
 * .....Another normal method: copy nums2 into nums1, then sort the whole array.
 * time: O(m+n);
 * space: O(1);
 * */
public class mergeArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0){
             if (i >= 0 && nums1[i] >= nums2[j]){
                 nums1[k] = nums1[i];
                 i--;
             }
             else{
                 nums1[k] = nums2[j];
                 j--;
             }
             k--;
        }
    }

    public static void main(String[] args){
        int[] a = new int[]{4, 0, 0, 0};
        int[] b = new int[]{2, 3, 5};
        merge(a,1,b,3);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}

/**import java.util.*;
 class Solution {
 public void merge(int[] nums1, int m, int[] nums2, int n) {
 for (int i = 0; i < n; i++) {
 nums1[m++] = nums2[i];
 }
 Arrays.sort(nums1);
 }
 }
 * */