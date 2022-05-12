package ua.lviv.iot.lab7;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {


    public List<String> detectPalindromes(String text) {
        String modifiedText1 = text.replaceAll("[\\W&&\\S]", "");
        String modifiedText2 = modifiedText1.replaceAll("(\\s)\\1+", "$1");
        String[] separateWords = modifiedText2.toLowerCase().split("\\W");
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
