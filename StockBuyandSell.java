public class StockBuyandSell {
    public int maximumProfit(int prices[]) {
        int max = 0 ; 
        int minProfit = Integer.MAX_VALUE; 
        for(int i = 0 ; i<prices.length;i++){
            if(prices[i]<minProfit){
                minProfit = prices[i];
            }else if(prices[i]-minProfit>max){
                max = prices[i]-minProfit ; 
            }
        }return max ; 
    }
    public static void main(String[] args) {
        StockBuyandSell s = new StockBuyandSell();
        int[] prices = {7, 10, 1, 3, 6, 9, 2}; 
        System.out.println(s.maximumProfit(prices));
    }
}
