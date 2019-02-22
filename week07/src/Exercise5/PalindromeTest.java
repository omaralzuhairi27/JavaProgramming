package week07.src.Exercise5;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome palindrome=new Palindrome();


    @Test
    void testsameWord() {
        String word = "madam";
        boolean reverseWord = palindrome.isPalindrome(word);
        assertTrue(reverseWord);
    }
}