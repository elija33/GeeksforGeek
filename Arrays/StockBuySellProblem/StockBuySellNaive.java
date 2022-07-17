package StockBuySellProblem;

public class StockBuySellNaive {
    public static int maxProfit(int price[], int start, int end){
        if(end <= start)
            return 0;

        int profit = 0;

        for(int i = start; i<end; i++){
            for(int j = i + 1; j <= end; j++){
                if(price[j] > price[i]){
                    int curr_profit = price[j] = price[i] + maxProfit(price, start, i - 1) + maxProfit(price, j + 1, end);
                    profit = Math.max(profit, curr_profit);
                }
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int number[] = { 1, 5, 3, 8, 12 }, n = 5;
        int numbers[] = {2,3,4,5,12,10}, start = 6;
        System.out.println(maxProfit(number, 0, n-1));
        System.out.println();
        System.out.println(maxProfit(numbers, 0, start-1));
    }
}
