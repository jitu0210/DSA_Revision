package array;

public class BestTimeToBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 }; // Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        System.out.println(stock(prices));
    }

    static int stock(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            // Update minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate profit
            int profit = prices[i] - minPrice;

            // Update max profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
