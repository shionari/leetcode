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
        int[] test = {1,2,3,4,5};
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.solution(test));
    }

    /**
     * 可行的解法，但在数组过大时导致超时
     * @param prices
     * @return
     */
    public int solution(int[] prices) {
        int[][] business = new int[prices.length][prices.length];
        // init resultArray
        for (int i = 0; i < business.length; i++) {
            for (int j = 0; j < business[i].length; j++) {
                business[i][j] = 0;
            }
        }
        // fix resultArray
        for (int i = 0; i < business.length; i++) {
            for (int j = i; j < business[i].length; j++) {
                business[i][j] = prices[j] - prices[i];
            }
        }

        for (int i = 0; i < business.length; i++) {
            for (int j = 0; j < business[i].length; j++) {
                System.out.print(business[i][j] + "\t");
            }
            System.out.println();
        }

        return calculate(business, 0, 1);
    }

    private int calculate(int[][] business, int startX, int startY) {
        /*if (startX == business.length -1 && startY == business[startX].length - 1) {
            // 到达底角边界
            return 0;
        }*/
        int best = 0;
        for (int i = startX; i < business.length; i++) {
            for (int j = startY; j < business[i].length; j++) {
                if (business[i][j] > 0) {
                    // 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）
                    int profit = business[i][j] + calculate(business, j + 1, i + 1);
                    if (profit > best) {
                        best = profit;
                    }
                }
            }
        }
        return best;
    }
}
