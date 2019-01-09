/**
 * 118. Pascal's Triangle
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 * time: O(n2), space: O(n)
 * */
import java.util.*;
public class pasTriangle{
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            pre.add(0,1);
            for (int j = 1; j < pre.size() - 1; j++) {
                pre.set(j, pre.get(j) + pre.get(j + 1));
            }
            result.add(new ArrayList<>(pre));//add the whole list pre as an element.
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(generate(5));
    }

}