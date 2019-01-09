/**7. Reverse Integer
 * Input: 123, Output: 321, OVERFLOW returns 0;
 * time: O(n);
 * space: O(1);
 * points: 1. Integer.MAX_VALUE, Integer.MIN_VALUE
 *         2. % get the digits; / the new number without the original digits.
 *         3. overflow, before return, need to judge whether overflow happens.
 *         4. long rev, cast to int when returns. If the reversed number overflows, before judging store
 *         it correctly first.
 * */
public class reverseInt{
    public static int reverse(int x){
        long rev = 0; //important
        while (x!=0){
            rev = rev*10 + x%10;
            if ((rev > Integer.MAX_VALUE)||(rev < Integer.MIN_VALUE)) return 0;
            x = x/10;
        }
        return (int)rev; //important
    }

    public static void main(String[] args){

        System.out.println(reverse(1534236469));
    }
}