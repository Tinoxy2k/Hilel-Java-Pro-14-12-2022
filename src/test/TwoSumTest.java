package test;

import Homework8.TwoSum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class TwoSumTest {
  TwoSum sum;
    @Before
   public void initialize(){
       sum = new TwoSum();

    }
    @DisplayName("Test if method contains TwoSum")
    @Test

    public void containsTwoSum(){
        int[] numbers = new int[]{4,2,4};
        int[] expected =  new int[]{0,2};
        int target = 8;
        int [] real = sum.twoSum(numbers,target);
        Assert.assertArrayEquals(expected,real);
    }
    @DisplayName("Test method twoSum  Failed")
    @Test

    public void NotContainsTwoSum(){
        int[] numbers = new int[]{4,2,4};
        int[] expected =  new int[]{0,1};
        int target = 8;
        int [] real = sum.twoSum(numbers,target);
        Assert.assertArrayEquals(expected,real);
    }

}
