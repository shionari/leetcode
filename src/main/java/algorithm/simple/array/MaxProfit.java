package algorithm.simple.array;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 * Created by shionari on 2018/5/10
 */
public class MaxProfit {

    public static void main(String[] args) {
        //int[] test = {1,2,3,4,5};
        int[] test = {7,2,3,6,4};
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.solution(test));
    }

    public int solution(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            // 策略：有赚就买卖
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
