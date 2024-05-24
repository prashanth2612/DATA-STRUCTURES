class Solution {
    public int maxProfit(int[] prices) {
        // If the prices array is empty, return 0 as no transactions can be made
        if (prices == null || prices.length == 0) return 0;

        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Iterate through the prices array
        for (int i = 0; i < prices.length; i++) {
            // Update min price if current price is lower
            if (prices[i] < min) {
                min = prices[i];
            } 
            // Calculate the profit if current price is sold at min price and update maxProfit if it's higher
            else if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            }
        }

        return maxProfit;
    }
}
