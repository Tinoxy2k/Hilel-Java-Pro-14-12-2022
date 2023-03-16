package HomeworkTest;

import Homework.BestTimeToBuyAndSell;
import org.junit.Assert;

import org.junit.Test;


public class BestTimeToBuyAndSellTest {
    BestTimeToBuyAndSell buyAndSell = new BestTimeToBuyAndSell();
    public int[] prices = {7, 1, 5, 3, 6, 4};


    @Test
    public void getBestTimeToBuyAndSell() {
        int expected = 5;
        int actual = buyAndSell.maxProfit(prices);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);

    }
}
