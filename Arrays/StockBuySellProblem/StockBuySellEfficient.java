package StockBuySellProblem;

public class StockBuySellEfficient {
    public static int maxProfit(int price[], int number){
        int profit = 0;
        for(int i = 1; i < number; i++){
            if(price[i] > price[i - 1])
            profit += price[i] - price[i - 1];
        }

        return profit;
    }
    public static void main(String[] args) {
        int numberstock[] = {1, 5, 3, 8, 12};
        int number = 5;
        int numstock[] = { 2, 3, 4, 5, 12, 10 }, start = 6;
        System.out.println(maxProfit(numberstock, number));
        System.out.println(maxProfit(numstock, start));
    }
}
