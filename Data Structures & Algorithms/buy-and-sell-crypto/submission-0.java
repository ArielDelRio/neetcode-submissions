class Solution {
    public int maxProfit(int[] prices) {
           if (prices.length == 1) {
            return 0;
        }

        int profit = 0;
        int minPriceDay = 0;
        int maxPriceDay = 1;

        while (maxPriceDay < prices.length) {
            profit = Math.max(profit, prices[maxPriceDay] - prices[minPriceDay]);
            if (prices[minPriceDay] > prices[maxPriceDay]) {
                minPriceDay = maxPriceDay;
            }
            maxPriceDay++;
        }

        return profit;
    }
}
