package ua.lviv.iot.lab7;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {


    public static List<String> detectPalindromes(String text) {
        String modifiedText = text.replaceAll(", ", "");
        String[] separateWords = modifiedText.toLowerCase().split("\\W");
        List<String> palindromes = new ArrayList<>();

        for (String word : separateWords) {
            int startingIndex = 0;

            int endIndex = word.length() - 1;
            boolean isPalindrome = true;

            while (startingIndex < endIndex) {

                if (word.charAt(startingIndex) != word.charAt(endIndex)) {
                    isPalindrome = false;
                    break;
                }
                startingIndex++;
                endIndex--;
            }
            if (isPalindrome) {
                palindromes.add(word);
            }
        }
        return palindromes;

    }
}
