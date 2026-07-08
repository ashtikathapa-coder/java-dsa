 class BestTimeToBuyAndSellStock {
     public static int maxProfit(int[] prices) {
         int minprice = Integer.MAX_VALUE;
         int maxprofit = 0;
         for (int i = 0; i < prices.length; i++) {
             if (prices[i] < minprice) {
                 minprice = prices[i];
             }
             int profit = prices[i] - minprice;


             if (profit > maxprofit) {
                 maxprofit = profit;

             }
         }
         return maxprofit;
     }


     public static void main(String[] args) {
         int[] prices = {7, 1, 5, 3, 6, 4};
         int result = maxProfit(prices);
         System.out.println("maximum profit=" + result);


     }
 }


