package ua.lviv.iot.lab7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class PalindromeTest {

    private Palindrome palindrome;

    @BeforeEach
    void SetUp(){
        palindrome = new Palindrome();
    }

    @Test
    void detectNoPalindromesInASentence() {
        String testText = "There is no palindromes, dude!";
        List<String> expected = new ArrayList<>();
        Assertions.assertEquals(expected, palindrome.detectPalindromes(testText));
    }

    @Test
    void detectPalindromesInASentence() {
        String testText = "aboba abooba ggu";
        List<String> expected = new ArrayList<>(Arrays.asList("aboba", "abooba"));
        Assertions.assertEquals(expected, palindrome.detectPalindromes(testText));
    }
}
