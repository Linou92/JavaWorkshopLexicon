package se.lexicon;

import java.util.Scanner;

public class PalindromeChecker {
    public static void printPalindromeChecker() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Enter a word: ");
        String word = scanner.nextLine();

        String lowerWord = word.toLowerCase();
        String reversed = new StringBuilder(lowerWord).reverse().toString();

        if (lowerWord.equals(reversed)) {
            IO.println(word + " is a palindrome.");
        } else {
            IO.println(word + " is NOT a palindrome.");
        }
    }
}
