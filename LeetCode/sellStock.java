/**121. Best Time to Buy and Sell Stock
 * Example 1:
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *              Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 * Time: O(n), Space: O(1)
 * */
public class sellStock{
    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) return 0;
        int min = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++){
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}