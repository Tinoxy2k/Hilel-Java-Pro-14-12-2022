package test;
import Homework8.ValidPalindrome;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class PalindromeTest {
    ValidPalindrome palindrome;
    @Before
   public void initialize(){
        palindrome = new ValidPalindrome();

    }
    @DisplayName("Test if method contains Palindrome")
    @Test

    public void containsPalindrome(){
        String strPalindrome = "A man, a plan, a canal: Panama";
        boolean expected = true;
        boolean real = palindrome.isPalindrome(strPalindrome);
        Assert.assertEquals(expected,real);
    }
    @DisplayName("Test method that don't contains Palindrome")
    @Test

    public void NotContainsPalindrome(){
        String strPalindrome = "race a car";
        boolean expected = false;
        boolean real = palindrome.isPalindrome(strPalindrome);
        Assert.assertEquals(expected,real);
    }

}
