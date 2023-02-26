package Homework8;

public class ValidPalindrome {
    public boolean isPalindrome(String str) {
        if (str.length() == 0) return true;
        String palindromeStr = "";


        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i)))
                palindromeStr += str.charAt(i);
        }
        palindromeStr = palindromeStr.toLowerCase();
        int start = 0;
        int end = palindromeStr.length() - 1;


        while (start < end) {
            if (palindromeStr.charAt(start) != palindromeStr.charAt(end)) return false;
            start++;
            end--;

        }
        return true;

    }
}
