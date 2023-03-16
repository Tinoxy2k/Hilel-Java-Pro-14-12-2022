package Homework;

public class BestTimeToBuyAndSell {
    public  int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < min) {
                min = price;

            } else {
                int tempValue = price - min;
                max = Math.max(max, tempValue);
            }
        }
        return max;

    }


}
