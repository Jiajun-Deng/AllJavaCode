/**13.Roman to Integer
 * Turn a string of Roman to an interger.
 * 1. int romanToInt(string s)
 * 2. int toNum(char c)
 * 3. main, use function romanToInt, with an instantiation of Roman string.
 * time:O(n), traverse the string
 * space:O(1), without creating any variable for the string.
 * */
public class romanToInt {
    public static int romanToInt(String s) {
        int ans = 0;
        if (s == null || s.length() == 0)
            return 0;
//      char[] roman = s.toCharArray();/**Change a string to a char array*/ increase the space complexity
        int i;
        for (i = 0; i < s.length() - 1; i++){
            if (toNum(s.charAt(i)) < toNum(s.charAt(i+1))){/**I<V, IV = V - I...*/
                ans += toNum(s.charAt(i+1)) - toNum(s.charAt(i));
                i++;     /**Compute two items at one time*/
            }
            else{
                ans += toNum(s.charAt(i));
            }
        }
        if (i == s.length() - 1) {
            ans += toNum(s.charAt(s.length()-1)); /**The last item, since there is nothing at the right of it.*/
        }
        return ans;
    }

    public static int toNum(char c){
        int error = 0;
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return error;
    }

    public static void main(String[] args){
        int r = romanToInt("III");
        System.out.print("r="+r);
    }
}