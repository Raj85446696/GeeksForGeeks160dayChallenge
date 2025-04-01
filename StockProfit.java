public class StockProfit {
    public static int maxProfit(int[] price) {
        int n = price.length;
        int profit = 0;
        boolean holding = false;
        int buyPrice = 0;

        for (int i = 0; i < n; i++) {
            if (!holding) { 
                // Buy if not holding
                buyPrice = price[i];
                holding = true;
            } else if (holding && price[i] > buyPrice) {
                // Sell if profit is possible
                profit += price[i] - buyPrice;
                holding = false;
            }
        }

        return profit;
    }
    public static void main(String[] args) {
        StockProfit s = new StockProfit();
        int[] price = {100 ,180, 260, 310, 40 ,535, 695}; 
        System.out.println(s.maxProfit(price));
    }
}
