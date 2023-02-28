package test;
import Homework8.ContainsDuplicate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ContainsDublicateTest {
    ContainsDuplicate dublicate;
    @Before
   public void initialize(){
        dublicate = new ContainsDuplicate();

    }
    @DisplayName("Test if method contains duplicate")
    @Test

    public void containsDublicate(){
        int [] numbers = new int[] {1,3,2,4,4,2};
        boolean expected = true;
        boolean real = dublicate.containsDuplicate(numbers);
        Assert.assertEquals(expected,real);
    }
    @DisplayName("Test method that don't contains duplicate")
    @Test

    public void NotContainsDuplicate(){
        int [] numbers = new int[] {1,3,2,8,7,10};
        boolean expected = false;
        boolean real = dublicate.containsDuplicate(numbers);
        Assert.assertEquals(expected,real);
    }

}
