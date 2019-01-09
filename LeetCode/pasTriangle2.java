/**
 * 119. Pascal's TriangleII
 * Input: 5
 * Output: the 5th row of the Pascal's Triangle.
 * [
 *  [1,4,6,4,1]
 * ]
 * time: O(n2), space: O(n)
 * */
import java.util.*;
public class pasTriangle2{
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= rowIndex; i++){
            list.add(0,1);
            for (int j = 1; j < list.size() - 1; j++)
            list.set(j, list.get(j) + list.get(j + 1));
        }
        return list;
    }
    public static void main(String[] args){
        System.out.println(getRow(5));
    }

}